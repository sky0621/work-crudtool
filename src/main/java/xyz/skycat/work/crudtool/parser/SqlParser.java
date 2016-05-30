package xyz.skycat.work.crudtool.parser;

import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;
import xyz.skycat.work.crudtool.parser.result.IfSqlParseResult;
import xyz.skycat.work.crudtool.parser.result.SqlParseResult;

import java.io.File;

/**
 * Created by SS on 2016/05/27.
 */
// I know Parser and to do parse.
public class SqlParser implements IfSqlParser {

    public SqlParser() {

    }

    public IfSqlParseResult parse(String sql) {
        Statement stmt = null;
//        Select selectStatement = null;
        try {
            stmt = CCJSqlParserUtil.parse(sql);

            // cast each Statement
//            selectStatement = (Select) stmt;
//            TableNamesFindVisitor finder = new TableNamesFindVisitor();
//            List<String> tableNameList = finder.getTableNameList(selectStatement);

        } catch (JSQLParserException e) {
            // TODO handle error
            e.printStackTrace();
        }

        IfSqlParseResult parseResult = new SqlParseResult();
        parseResult.setStatement(stmt);

        // use converter
//        SelectBody body = selectStatement.getSelectBody();
//        System.out.println(body.toString());
//        List<WithItem> withItemList = selectStatement.getWithItemsList();
//        if (withItemList != null) {
//            withItemList.stream().forEach(item -> {
//                System.out.println(item.getName());
//            });
//        }
//        System.out.println(selectStatement.toString());

        return parseResult;
    }

    // FIXME
    public IfSqlParseResult parse(File sqlFile) {
        return null;
    }

}
