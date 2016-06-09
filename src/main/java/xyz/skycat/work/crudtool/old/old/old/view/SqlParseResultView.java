package xyz.skycat.work.crudtool.old.old.old.view;

import xyz.skycat.work.crudtool.old.old.old.type.CrudTypeEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SS on 2016/06/01.
 */
public class SqlParseResultView implements IfSqlParseResultView {

    private List<String> tableNameList;

    private String sqlFileName;

    private CrudTypeEnum crudType;

    public SqlParseResultView() {
        tableNameList = new ArrayList<>();
    }

    @Override
    public void output() {
        if(sqlFileName==null){
            System.out.println("sqlFileName is null.");
        }
        if(crudType==null){
            System.out.println("crudType is null.");
            return;
        }
        System.out.print(String.format("%s\t%s\n", sqlFileName, crudType.alias()));
        tableNameList.stream().forEach(System.out::println);
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
