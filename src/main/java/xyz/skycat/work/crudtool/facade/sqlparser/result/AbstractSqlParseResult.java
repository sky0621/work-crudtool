package xyz.skycat.work.crudtool.facade.sqlparser.result;

import xyz.skycat.work.crudtool.facade.type.CrudTypeEnum;

/**
 * Created by SS on 2016/05/27.
 */
public abstract class AbstractSqlParseResult implements IfSqlParseResult {

    private String sqlFileName;

    private CrudTypeEnum crudType;

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
