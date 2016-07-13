package xyz.skycat.work.crudtool.facade.view;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SS on 2016/07/14.
 */
public class TableNamesFindSqlParseResultView implements IfSqlParseResultView {

    private IfSqlParseResultHeaderView headerView;

    private List<IfSqlParseResultBodyView> bodyViewList;

    public TableNamesFindSqlParseResultView() {

        bodyViewList = new ArrayList<>();
    }

    @Override
    public IfSqlParseResultHeaderView getHeader() {
        return headerView;
    }

    @Override
    public void setHeader(IfSqlParseResultHeaderView header) {
        headerView = header;
    }

    @Override
    public List<IfSqlParseResultBodyView> getBodyList() {
        return bodyViewList;
    }

    @Override
    public void addBody(IfSqlParseResultBodyView body) {
        bodyViewList.add(body);
    }

}
