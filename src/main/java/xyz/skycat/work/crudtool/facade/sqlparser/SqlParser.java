package xyz.skycat.work.crudtool.facade.sqlparser;

import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;
import xyz.skycat.work.crudtool.facade.statement.IfStatementWrapper;
import xyz.skycat.work.crudtool.facade.statement.StatementWrapper;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Created by SS on 2016/05/27.
 */
public class SqlParser implements IfSqlParser {

    // wrap JSqlParser and Statement.
    @Override
    public IfStatementWrapper parse(Path sqlFilePath) {

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

        return new StatementWrapper().set(stmt);
    }

}
