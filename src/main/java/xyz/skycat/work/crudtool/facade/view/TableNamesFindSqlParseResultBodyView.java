package xyz.skycat.work.crudtool.facade.view;

import xyz.skycat.work.crudtool.facade.type.CrudTypeEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SS on 2016/06/01.
 */
public class TableNamesFindSqlParseResultBodyView implements IfSqlParseResultBodyView {

    private String sqlFileName;

    private List<String> tableCrudList;

    public TableNamesFindSqlParseResultBodyView() {
        tableCrudList = new ArrayList<>();
    }

    @Override
    public void setSqlFileName(String sqlFileName) {
        this.sqlFileName = sqlFileName;
    }

    @Override
    public String getSqlFileName() {
        return sqlFileName;
    }

    public List<String> getTableCrudList() {
        return tableCrudList;
    }

    public void addTableCrudList(CrudTypeEnum crudType) {
        tableCrudList.add(crudType.alias());
    }

}
