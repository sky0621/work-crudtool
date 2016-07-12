package xyz.skycat.work.crudtool.output;

import xyz.skycat.work.crudtool.facade.view.IfSqlParseResultView;

import java.util.List;

/**
 * Created by SS on 2016/06/15.
 */
public class ConsoleOutputer implements IfCrudOutputer {

    @Override
    public void output(List<IfSqlParseResultView> viewList) {
        // FIXME
//        System.out.print(String.format("%s\t", getSqlFileName()));
//        getStreamData().forEachOrdered(tableName -> {
//            System.out.print(String.format("%s(%s)\t", tableName, getCrudType().alias()));
//        });
//        System.out.print("\n");
    }

}
