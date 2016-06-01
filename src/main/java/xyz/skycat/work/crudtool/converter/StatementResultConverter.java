package xyz.skycat.work.crudtool.converter;

import xyz.skycat.work.crudtool.parser.result.IfSqlParseResult;
import xyz.skycat.work.crudtool.view.IfSqlParseResultView;
import xyz.skycat.work.crudtool.view.SqlParseResultView;

import java.util.List;

/**
 * Created by SS on 2016/06/01.
 */
// TODO think! To do Static class?
public class StatementResultConverter implements IfStatementResultConverter {

    @Override
    public IfSqlParseResultView convertToTableNameList(IfSqlParseResult sqlParseResult) {
        // TODO think! Ummmmm. just DTO...
        IfSqlParseResultView view = new SqlParseResultView();
        view.setCrudType(sqlParseResult.getCrudType());
        view.setSqlFileName(sqlParseResult.getSqlFileName());
        view.setTableNameList(sqlParseResult.getTableNameList());
        return view;
    }

}
