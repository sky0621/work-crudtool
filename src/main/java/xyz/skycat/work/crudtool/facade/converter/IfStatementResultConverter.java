package xyz.skycat.work.crudtool.facade.converter;

import xyz.skycat.work.crudtool.facade.sqlparser.result.IfSqlParseResult;
import xyz.skycat.work.crudtool.facade.view.IfSqlParseResultView;

import java.util.List;

/**
 * Created by SS on 2016/06/01.
 */
public interface IfStatementResultConverter {

    IfSqlParseResultView convert(List<IfSqlParseResult> sqlParseResultList);

}
