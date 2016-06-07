package xyz.skycat.work.crudtool.parser;

import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;
import xyz.skycat.work.crudtool.parser.resolver.StatementResolvers;
import xyz.skycat.work.crudtool.parser.result.IfSqlParseResult;
import xyz.skycat.work.crudtool.parser.visitor.IfStatementVisitor;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Created by SS on 2016/05/27.
 */
public class SqlParser implements IfSqlParser {

    private IfStatementVisitor statementVisitor;

    public SqlParser(IfStatementVisitor visitor) {
        statementVisitor = visitor;
    }

    // wrap JSqlParser and Statement.
    @Override
    public IfSqlParseResult parse(Path sqlFilePath) {
        InputStream sqlInputStream = null;
        try {
            sqlInputStream = Files.newInputStream(sqlFilePath);
        } catch (IOException e) {
            // TODO error handling.
            e.printStackTrace();
            return null;
        }
        Statement stmt = null;
        try {
            stmt = CCJSqlParserUtil.parse(sqlInputStream);
        } catch (JSQLParserException e) {
            // TODO error handling.
            e.printStackTrace();
            return null;
        }

        IfSqlParseResult parseResult = new StatementResolvers().resolve(stmt);
        parseResult.setSqlFileName(sqlFilePath.getFileName().toString());

        return parseResult;
    }

}
