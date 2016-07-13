package xyz.skycat.work.crudtool.facade.view;

import xyz.skycat.work.crudtool.facade.type.CrudTypeEnum;

import java.util.List;

/**
 * Created by SS on 2016/07/14.
 */
public interface IfSqlParseResultBodyView {

    String getSqlFileName();

    void setSqlFileName(String sqlFileName);

    List<String> getTableCrudList();

    void addTableCrudList(CrudTypeEnum crudType);

}
