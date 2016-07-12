package xyz.skycat.work.crudtool.facade.statement.receiver;

import net.sf.jsqlparser.statement.delete.Delete;
import net.sf.jsqlparser.statement.insert.Insert;
import net.sf.jsqlparser.statement.select.Select;
import net.sf.jsqlparser.statement.update.Update;
import net.sf.jsqlparser.util.TablesNamesFinder;
import xyz.skycat.work.crudtool.facade.sqlparser.result.IfSqlParseResult;
import xyz.skycat.work.crudtool.facade.sqlparser.result.TableNamesFindSqlParseResult;

import java.util.List;

/**
 * Created by SS on 2016/06/09.
 */
public class TableNamesFindReceiver implements IfStatementReceiver {

    @Override
    public IfSqlParseResult receive(Select statement) {

        TablesNamesFinder tablesNamesFinder = new TablesNamesFinder();
        List<String> tableList = tablesNamesFinder.getTableList(statement);
        IfSqlParseResult parseResult = new TableNamesFindSqlParseResult();
        parseResult.setResult(tableList);
        return parseResult;
    }

    @Override
    public IfSqlParseResult receive(Insert statement) {

        TablesNamesFinder tablesNamesFinder = new TablesNamesFinder();
        List<String> tableList = tablesNamesFinder.getTableList(statement);
        IfSqlParseResult parseResult = new TableNamesFindSqlParseResult();
        parseResult.setResult(tableList);
        return parseResult;
    }

    @Override
    public IfSqlParseResult receive(Update statement) {

        TablesNamesFinder tablesNamesFinder = new TablesNamesFinder();
        List<String> tableList = tablesNamesFinder.getTableList(statement);
        IfSqlParseResult parseResult = new TableNamesFindSqlParseResult();
        parseResult.setResult(tableList);
        return parseResult;
    }

    @Override
    public IfSqlParseResult receive(Delete statement) {

        TablesNamesFinder tablesNamesFinder = new TablesNamesFinder();
        List<String> tableList = tablesNamesFinder.getTableList(statement);
        IfSqlParseResult parseResult = new TableNamesFindSqlParseResult();
        parseResult.setResult(tableList);
        return parseResult;
    }

}
