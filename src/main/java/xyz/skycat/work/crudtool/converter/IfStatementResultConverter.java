package xyz.skycat.work.crudtool.converter;

import xyz.skycat.work.crudtool.visitor.result.IfStatementVisitResult;

import java.util.List;

/**
 * Created by SS on 2016/06/01.
 */
public interface IfStatementResultConverter {

    List<String> convertToTableNameList(IfStatementVisitResult result);

}
