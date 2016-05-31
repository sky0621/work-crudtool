package xyz.skycat.work.crudtool.converter;

import xyz.skycat.work.crudtool.visitor.result.IfStatementVisitResult;

import java.util.List;

/**
 * Created by SS on 2016/06/01.
 */
// TODO think! To do Static class?
public class StatementResultConverter implements IfStatementResultConverter {

    @Override
    public List<String> convertToTableNameList(IfStatementVisitResult result) {
        List<String> tableNameList = result.getTableNameList();
        // Now, nothing to do.
        return tableNameList;
    }

}
