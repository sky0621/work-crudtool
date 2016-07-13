package xyz.skycat.work.crudtool.facade.converter;

import xyz.skycat.work.crudtool.facade.sqlparser.result.IfSqlParseResult;
import xyz.skycat.work.crudtool.facade.type.CrudTypeEnum;
import xyz.skycat.work.crudtool.facade.view.*;

import java.util.List;

/**
 * Created by SS on 2016/06/06.
 */
public class TableNamesFindConverter implements IfStatementResultConverter {

    @Override
    public IfSqlParseResultView convert(List<IfSqlParseResult> sqlParseResultList) {

        // MEMO: sqlParseResultList have all SQL files parse results.
        // MEMO:   [0] : TableNamesFindSqlParseResult
        // MEMO:                      - sqlFileName : fullpath
        // MEMO:                      - crudType    : CrudTypeEnum ... SELECT
        // MEMO:                      - tableList   : List<String>

        IfSqlParseResultView parseResultView = new TableNamesFindSqlParseResultView();

        /*
         * Make Header View
         */
        IfSqlParseResultHeaderView parseResultHeaderView = new TableNamesFindSqlParseResultHeaderView();
        parseResultHeaderView.setLabel("SQLファイル");
        parseResultView.setHeader(parseResultHeaderView);

        // 1st. aggregate all table set that using.
        sqlParseResultList.stream().forEach(parseResult -> {
            List<String> tableNameList = (List<String>) parseResult.getResult();
            tableNameList.stream().forEach(tableName -> {
                parseResultHeaderView.addTableNameList(tableName);
            });
        });

        /*
         * Make Body List View
         */
        sqlParseResultList.stream().forEach(parseResultByOneSqlFile -> {
            IfSqlParseResultBodyView bodyView = new TableNamesFindSqlParseResultBodyView();
            bodyView.setSqlFileName(parseResultByOneSqlFile.getSqlFileName());
            parseResultView.addBody(bodyView);

            parseResultHeaderView.getTableNameList().stream().forEach(tableName -> {
                if (((List<String>) parseResultByOneSqlFile.getResult()).contains(tableName)) {
                    bodyView.addTableCrudList(parseResultByOneSqlFile.getCrudType());
                } else {
                    bodyView.addTableCrudList(CrudTypeEnum.OTHERS);
                }
            });
        });

        return parseResultView;
    }

}
