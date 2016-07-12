package xyz.skycat.work.crudtool.facade.converter;

import xyz.skycat.work.crudtool.facade.sqlparser.result.IfSqlParseResult;
import xyz.skycat.work.crudtool.facade.view.IfSqlParseResultView;
import xyz.skycat.work.crudtool.facade.view.TableNamesFindSqlParseResultView;

import java.util.*;

/**
 * Created by SS on 2016/06/06.
 */
public class TableNamesFindConverter implements IfStatementResultConverter {

    @Override
    public List<IfSqlParseResultView> convert(List<IfSqlParseResult> sqlParseResultList) {

        List<IfSqlParseResultView> parseResultViewList = new ArrayList<>();

        // aggregate all table set that using.
        Set<String> tableNameSet = new TreeSet<>();
        sqlParseResultList.stream().forEach(parseResult -> {
            List<String> tableNameList = (List<String>) parseResult.getResult();
            tableNameList.stream().forEach(tableName -> tableNameSet.add(tableName));
        });

        //
        TableNamesFindSqlParseResultView view = new TableNamesFindSqlParseResultView();
        sqlParseResultList.stream().forEach(parseResult -> {
            TableNamesFindSqlParseResultView parseResultView = new TableNamesFindSqlParseResultView();
            parseResultView.setSqlFileName(parseResult.getSqlFileName());

            // FIXME ........................!!!!

            List<String> tableNameList = (List<String>) parseResult.getResult();
            tableNameList.stream().forEach(tableName -> tableNameSet.add(tableName));
        });

//        view.setCrudType(sqlParseResult.getCrudType());
//        view.setSqlFileName(sqlParseResult.getSqlFileName());
//        view.setTableNameList((List<String>) sqlParseResult.getResult());
        return parseResultViewList;
    }

}
