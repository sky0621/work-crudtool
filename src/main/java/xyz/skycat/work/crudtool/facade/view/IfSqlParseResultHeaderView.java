package xyz.skycat.work.crudtool.facade.view;

import java.util.List;

/**
 * Created by SS on 2016/07/14.
 */
public interface IfSqlParseResultHeaderView {

    String getLabel();

    void setLabel(String label);

    List<String> getTableNameList();

    void addTableNameList(String tableName);

}
