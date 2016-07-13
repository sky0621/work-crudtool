package xyz.skycat.work.crudtool.facade.view;

import java.util.List;

/**
 * Created by SS on 2016/06/01.
 */
public interface IfSqlParseResultView {

    IfSqlParseResultHeaderView getHeader();

    void setHeader(IfSqlParseResultHeaderView header);

    List<IfSqlParseResultBodyView> getBodyList();

    void addBody(IfSqlParseResultBodyView body);

}
