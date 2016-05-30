package xyz.skycat.work.crudtool.visitor.result;

import java.util.List;

/**
 * Created by SS on 2016/05/31.
 */
public interface IfStatementVisitResult {

    // TODO think. tablename(String) ? or Table ?
    List<String> getTableNameList();

    void setTableNameList(List<String> tableNameList);

    void addTableName(String tableName);

}
