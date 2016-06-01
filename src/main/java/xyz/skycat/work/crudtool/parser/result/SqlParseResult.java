package xyz.skycat.work.crudtool.parser.result;

import net.sf.jsqlparser.statement.Statement;
import xyz.skycat.work.crudtool.type.CrudTypeEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SS on 2016/05/27.
 */
public class SqlParseResult implements IfSqlParseResult {

    private List<String> tableNameList;

    private String sqlFileName;

    private CrudTypeEnum crudType;

    public SqlParseResult() {
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
