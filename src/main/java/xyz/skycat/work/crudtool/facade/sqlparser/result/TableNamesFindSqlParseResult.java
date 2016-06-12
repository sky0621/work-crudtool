package xyz.skycat.work.crudtool.facade.sqlparser.result;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SS on 2016/06/09.
 */
public class TableNamesFindSqlParseResult extends AbstractSqlParseResult {

    private List<String> tableList = null;

    public TableNamesFindSqlParseResult() {

        tableList = new ArrayList<>();
    }

    @Override
    public void setResult(Object result) {

        if (result instanceof List) {
            tableList = (List<String>) result;
        }
    }

    @Override
    public Object getResult() {
        return tableList;
    }

}
