package xyz.skycat.work.crudtool.facade.view;

import xyz.skycat.work.crudtool.facade.exception.CrudMakeException;
import xyz.skycat.work.crudtool.facade.type.CrudTypeEnum;
import xyz.skycat.work.crudtool.output.IfCrudOutputer;

import java.util.List;

/**
 * Created by SS on 2016/06/01.
 */
public interface IfSqlParseResultView {

    void output(IfCrudOutputer outputer) throws CrudMakeException;

    void setSqlFileName(String sqlFileName);

    String getSqlFileName();

    void setCrudType(CrudTypeEnum crudType);

    CrudTypeEnum getCrudType();

}
