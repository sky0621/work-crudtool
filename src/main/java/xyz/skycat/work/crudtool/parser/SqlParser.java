package xyz.skycat.work.crudtool.parser;

import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.delete.Delete;
import net.sf.jsqlparser.statement.insert.Insert;
import net.sf.jsqlparser.statement.select.Select;
import net.sf.jsqlparser.statement.update.Update;
import xyz.skycat.work.crudtool.parser.result.IfSqlParseResult;
import xyz.skycat.work.crudtool.parser.result.SqlParseResult;
import xyz.skycat.work.crudtool.parser.visitor.IfStatementVisitor;
import xyz.skycat.work.crudtool.type.CrudTypeEnum;

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
            // TODO handle error
            e.printStackTrace();
        }

        CrudTypeEnum crudType = null;

        // TODO output1SqlFileCrud other way.
        if (stmt instanceof Select) {
            ((Select) stmt).getSelectBody().accept(statementVisitor);
            crudType = CrudTypeEnum.SELECT;
        }
        if (stmt instanceof Insert) {
            // FIXME PG.
        }
        if (stmt instanceof Update) {
            // FIXME PG.
        }
        if (stmt instanceof Delete) {
            // FIXME PG.
        }

        IfSqlParseResult parseResult = statementVisitor.getSqlParseResult();
        parseResult.setSqlFileName(sqlFilePath.getFileName().toString());
        parseResult.setCrudType(crudType);

        return parseResult;
    }

}
