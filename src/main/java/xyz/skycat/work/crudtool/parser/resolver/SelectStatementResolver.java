package xyz.skycat.work.crudtool.parser.resolver;

import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.select.Select;
import net.sf.jsqlparser.util.TablesNamesFinder;
import xyz.skycat.work.crudtool.parser.result.IfSqlParseResult;
import xyz.skycat.work.crudtool.parser.result.SqlParseResult;
import xyz.skycat.work.crudtool.type.CrudTypeEnum;

import java.util.List;

/**
 * Created by SS on 2016/06/08.
 */
public class SelectStatementResolver implements IfStatementResolver {

    @Override
    public boolean isTarget(Statement statement) {
        return statement instanceof Select;
    }

    @Override
    public IfSqlParseResult resolve(Statement statement) {

        TablesNamesFinder tablesNamesFinder = new TablesNamesFinder();
        List<String> tableList = tablesNamesFinder.getTableList((Select) statement);

        IfSqlParseResult parseResult = new SqlParseResult();
        parseResult.setCrudType(CrudTypeEnum.SELECT);
        parseResult.setTableNameList(tableList);

        return parseResult;
    }

}
