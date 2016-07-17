package xyz.skycat.work.crudtool.facade.view;

import java.util.List;
import java.util.TreeSet;

/**
 * Created by SS on 2016/07/14.
 */
public interface IfSqlParseResultHeaderView {

    String getLabel();

    void setLabel(String label);

    TreeSet<String> getTableNameList();

    void addTableNameList(String tableName);

}
