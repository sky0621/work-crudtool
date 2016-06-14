package xyz.skycat.work.crudtool.facade.view;

import xyz.skycat.work.crudtool.facade.exception.CrudMakeException;
import xyz.skycat.work.crudtool.facade.type.CrudTypeEnum;
import xyz.skycat.work.crudtool.output.IfCrudOutputer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SS on 2016/06/01.
 */
public class TableNamesFindSqlParseResultView implements IfSqlParseResultView {

    private List<String> tableNameList;

    private String sqlFileName;

    private CrudTypeEnum crudType;

    public TableNamesFindSqlParseResultView() {
        tableNameList = new ArrayList<>();
    }

    @Override
    public void output(IfCrudOutputer outputer) throws CrudMakeException {

        if (sqlFileName == null) {
            throw new CrudMakeException(new IllegalArgumentException("sqlFileName is null"));
        }
        if (crudType == null) {
            throw new CrudMakeException(new IllegalArgumentException("crudType is null"));
        }

        outputer.setSqlFileName(sqlFileName);
        outputer.setCrudType(crudType);
        outputer.setStreamData(tableNameList.stream());
        outputer.output();
    }

    public List<String> getTableNameList() {
        return tableNameList;
    }

    public void setTableNameList(List<String> tableNameList) {
        this.tableNameList = tableNameList;
    }

    public void addTableName(String tableName) {
        tableNameList.add(tableName);
    }

    @Override
    public void setSqlFileName(String sqlFileName) {
        this.sqlFileName = sqlFileName;
    }

    @Override
    public String getSqlFileName() {
        return sqlFileName;
    }

    @Override
    public void setCrudType(CrudTypeEnum crudType) {
        this.crudType = crudType;
    }

    @Override
    public CrudTypeEnum getCrudType() {
        return crudType;
    }

}
