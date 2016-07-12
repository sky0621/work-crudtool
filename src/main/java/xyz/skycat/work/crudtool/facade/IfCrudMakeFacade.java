package xyz.skycat.work.crudtool.facade;

import xyz.skycat.work.crudtool.exception.CrudMakeException;
import xyz.skycat.work.crudtool.facade.sqlparser.result.IfSqlParseResult;

import java.nio.file.Path;

/**
 * Created by SS on 2016/06/10.
 */
public interface IfCrudMakeFacade {

    public IfSqlParseResult parseProcess(Path sqlFilePath) throws CrudMakeException;

}
