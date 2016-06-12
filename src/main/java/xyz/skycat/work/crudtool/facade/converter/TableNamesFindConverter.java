package xyz.skycat.work.crudtool.facade.converter;

import xyz.skycat.work.crudtool.facade.sqlparser.result.IfSqlParseResult;
import xyz.skycat.work.crudtool.facade.view.IfSqlParseResultView;
import xyz.skycat.work.crudtool.facade.view.SqlParseResultView;

import java.util.List;

/**
 * Created by SS on 2016/06/06.
 */
public class TableNamesFindConverter implements IfStatementResultConverter {

    @Override
    public IfSqlParseResultView convert(IfSqlParseResult sqlParseResult) {

        // TODO think! Ummmmm. just DTO...
        IfSqlParseResultView view = new SqlParseResultView();
        view.setCrudType(sqlParseResult.getCrudType());
        view.setSqlFileName(sqlParseResult.getSqlFileName());
        view.setTableNameList((List<String>) sqlParseResult.getResult());
        return view;
    }

}
