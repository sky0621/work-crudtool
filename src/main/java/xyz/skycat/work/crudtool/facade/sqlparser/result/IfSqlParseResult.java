package xyz.skycat.work.crudtool.facade.sqlparser.result;

import xyz.skycat.work.crudtool.facade.type.CrudTypeEnum;

/**
 * Created by SS on 2016/05/27.
 */
public interface IfSqlParseResult {

    public void setSqlFileName(String sqlFileName);

    public String getSqlFileName();

    public void setCrudType(CrudTypeEnum crudType);

    public CrudTypeEnum getCrudType();

    public void setResult(Object result);

    public Object getResult();

}
