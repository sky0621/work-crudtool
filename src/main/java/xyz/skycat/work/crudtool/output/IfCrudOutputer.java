package xyz.skycat.work.crudtool.output;

import xyz.skycat.work.crudtool.facade.view.IfSqlParseResultView;

import java.util.List;

/**
 * Created by SS on 2016/06/14.
 */
public interface IfCrudOutputer {

    public void output(List<IfSqlParseResultView> viewList);

}
