package xyz.skycat.work.crudtool.visitor.result;

import net.sf.jsqlparser.schema.Table;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SS on 2016/05/31.
 */
public class StatementVisitResult implements IfStatementVisitResult {

    private List<String> tableNameList;

    public StatementVisitResult() {
        tableNameList = new ArrayList<>();
    }

    @Override
    public List<String> getTableNameList() {
        return tableNameList;
    }

    @Override
    public void setTableNameList(List<String> tableNameList) {
        this.tableNameList = tableNameList;
    }

    @Override
    public void addTableName(String tableName) {
        tableNameList.add(tableName);
    }

}
