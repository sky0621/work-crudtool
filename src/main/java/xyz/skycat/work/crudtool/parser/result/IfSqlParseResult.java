package xyz.skycat.work.crudtool.parser.result;

import net.sf.jsqlparser.statement.Statement;
import xyz.skycat.work.crudtool.type.CrudTypeEnum;

import java.util.List;

/**
 * Created by SS on 2016/05/27.
 */
public interface IfSqlParseResult {

    // TODO think. tablename(String) ? or Table ?
    List<String> getTableNameList();

    void setTableNameList(List<String> tableNameList);

    void addTableName(String tableName);

    void setSqlFileName(String sqlFileName);

    String getSqlFileName();

    void setCrudType(CrudTypeEnum crudType);

    CrudTypeEnum getCrudType();

}
