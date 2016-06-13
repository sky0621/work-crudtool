package xyz.skycat.work.crudtool.facade;

import xyz.skycat.work.crudtool.facade.exception.CrudMakeException;

import java.nio.file.Path;

/**
 * Created by SS on 2016/06/10.
 */
public interface IfCrudMakeFacade {

    public void parseProcess(Path sqlFilePath) throws CrudMakeException;

}
