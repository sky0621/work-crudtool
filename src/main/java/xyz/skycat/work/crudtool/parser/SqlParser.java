package xyz.skycat.work.crudtool.parser;

import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;
import xyz.skycat.work.crudtool.parser.result.IfSqlParseResult;
import xyz.skycat.work.crudtool.parser.result.SqlParseResult;

import java.io.File;
import java.io.InputStream;

/**
 * Created by SS on 2016/05/27.
 */
// I know JSqlParser and to do parse.
public class SqlParser implements IfSqlParser {

    @Override
    public IfSqlParseResult parse(String sql) {
        Statement stmt = null;
        try {
            stmt = CCJSqlParserUtil.parse(sql);

        } catch (JSQLParserException e) {
            // TODO handle error
            e.printStackTrace();
        }

        IfSqlParseResult parseResult = new SqlParseResult();
        parseResult.setStatement(stmt);

        return parseResult;
    }

    // FIXME
    public IfSqlParseResult parse(File sqlFile) {
        return null;
    }

    @Override
    public IfSqlParseResult parse(InputStream sqlInputStream) {
        Statement stmt = null;
        try {
            stmt = CCJSqlParserUtil.parse(sqlInputStream);

        } catch (JSQLParserException e) {
            // TODO handle error
            e.printStackTrace();
        }

        IfSqlParseResult parseResult = new SqlParseResult();
        parseResult.setStatement(stmt);

        return parseResult;
    }

}
