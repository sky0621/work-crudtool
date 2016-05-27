package xyz.skycat.work.crudtool.parser;

import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.select.Select;
import net.sf.jsqlparser.statement.select.SelectBody;
import net.sf.jsqlparser.statement.select.WithItem;
import xyz.skycat.work.crudtool.parser.result.IfSqlParseResult;

import java.io.File;
import java.util.List;

/**
 * Created by SS on 2016/05/27.
 */
public class SqlParser implements IfSqlParser {

    public SqlParser() {

    }

    public IfSqlParseResult parse(String sql) {
        Statement stmt = null;
        Select selectStatement = null;
        try {
            stmt = CCJSqlParserUtil.parse(sql);

            // cast each Statement
            selectStatement = (Select) stmt;

        } catch (JSQLParserException e) {
            // TODO handle error
            e.printStackTrace();
        }

        // use converter
        SelectBody body = selectStatement.getSelectBody();
        System.out.println(body.toString());
        List<WithItem> withItemList = selectStatement.getWithItemsList();
        if (withItemList != null) {
            withItemList.stream().forEach(item -> {
                System.out.println(item.getName());
            });
        }
        System.out.println(selectStatement.toString());

        return null;
    }

    public IfSqlParseResult parse(File sqlFile) {
        return null;
    }
}
