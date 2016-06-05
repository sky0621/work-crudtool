package xyz.skycat.work.crudtool.converter;

import xyz.skycat.work.crudtool.parser.result.IfSqlParseResult;
import xyz.skycat.work.crudtool.view.IfSqlParseResultView;
import xyz.skycat.work.crudtool.view.SqlParseResultView;

/**
 * Created by SS on 2016/06/06.
 */
public class TableNamesConverter implements IfStatementResultConverter {

    @Override
    public IfSqlParseResultView convert(IfSqlParseResult sqlParseResult) {
        // TODO think! Ummmmm. just DTO...
        IfSqlParseResultView view = new SqlParseResultView();
        view.setCrudType(sqlParseResult.getCrudType());
        view.setSqlFileName(sqlParseResult.getSqlFileName());
        view.setTableNameList(sqlParseResult.getTableNameList());
        return view;
    }

}
