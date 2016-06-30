package xyz.skycat.work.crudtool.facade.sqlparser;

import xyz.skycat.work.crudtool.exception.CrudMakeException;
import xyz.skycat.work.crudtool.facade.statement.IfStatementWrapper;

import java.nio.file.Path;

/**
 * Created by SS on 2016/05/27.
 */
public interface IfSqlParser {

    IfStatementWrapper parse(Path sqlFilePath) throws CrudMakeException;

}
