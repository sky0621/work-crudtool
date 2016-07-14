package xyz.skycat.work.crudtool.config;

import xyz.skycat.work.crudtool.exception.CrudMakeException;
import xyz.skycat.work.crudtool.facade.IfCrudMakeFacade;
import xyz.skycat.work.crudtool.facade.converter.IfStatementResultConverter;
import xyz.skycat.work.crudtool.output.IfCrudOutputer;

import java.nio.file.Path;

/**
 * Created by SS on 2016/06/10.
 */
public interface IfConfiguration {

    IfCrudMakeFacade createFacade();

    IfStatementResultConverter createConverter();

    IfCrudOutputer createOutputer(Path outputPath) throws CrudMakeException;

}
