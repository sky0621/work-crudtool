package xyz.skycat.work.crudtool.facade.statement.receiver;

import net.sf.jsqlparser.statement.delete.Delete;
import net.sf.jsqlparser.statement.insert.Insert;
import net.sf.jsqlparser.statement.select.Select;
import net.sf.jsqlparser.statement.update.Update;
import xyz.skycat.work.crudtool.facade.sqlparser.result.IfSqlParseResult;

/**
 * Created by SS on 2016/06/09.
 */
public interface IfStatementReceiver {

    default IfSqlParseResult receive(Select statement) {
        return null;
    }

    default IfSqlParseResult receive(Insert statement) {
        return null;
    }

    default IfSqlParseResult receive(Update statement) {
        return null;
    }

    default IfSqlParseResult receive(Delete statement) {
        return null;
    }

}
