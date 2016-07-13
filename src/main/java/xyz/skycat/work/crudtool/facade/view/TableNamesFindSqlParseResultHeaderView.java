package xyz.skycat.work.crudtool.facade.view;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SS on 2016/07/14.
 */
public class TableNamesFindSqlParseResultHeaderView implements IfSqlParseResultHeaderView {

    private String label;

    private List<String> tableNameList;

    public TableNamesFindSqlParseResultHeaderView() {
        tableNameList = new ArrayList<>();
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public List<String> getTableNameList() {
        return tableNameList;
    }

    @Override
    public void addTableNameList(String tableName) {
        tableNameList.add(tableName);
    }

}
