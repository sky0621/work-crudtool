package xyz.skycat.work.crudtool.parser.receiver;

import net.sf.jsqlparser.statement.select.Select;
import net.sf.jsqlparser.util.TablesNamesFinder;
import xyz.skycat.work.crudtool.parser.result.IfSqlParseResult;
import xyz.skycat.work.crudtool.parser.result.AbstractSqlParseResult;
import xyz.skycat.work.crudtool.parser.result.TableNamesFindSqlParseResult;

import java.util.List;

/**
 * Created by SS on 2016/06/09.
 */
public class TableNamesFindReceiver implements IfStatementResolveReceiver {

    @Override
    public IfSqlParseResult receive(Select statement) {

        TablesNamesFinder tablesNamesFinder = new TablesNamesFinder();
        List<String> tableList = tablesNamesFinder.getTableList(statement);
        IfSqlParseResult parseResult = new TableNamesFindSqlParseResult();
        parseResult.setResult(tableList);
        return parseResult;
    }

}
