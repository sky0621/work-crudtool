package xyz.skycat.work.crudtool.old.old.old.view;

import xyz.skycat.work.crudtool.old.old.old.type.CrudTypeEnum;

import java.util.List;

/**
 * Created by SS on 2016/06/01.
 */
public interface IfSqlParseResultView {

    void output();

    // TODO think. tablename(String) ? or Table ?
    List<String> getTableNameList();

    void setTableNameList(List<String> tableNameList);

    void addTableName(String tableName);

    void setSqlFileName(String sqlFileName);

    String getSqlFileName();

    void setCrudType(CrudTypeEnum crudType);

    CrudTypeEnum getCrudType();

}
