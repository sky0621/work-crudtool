package xyz.skycat.work.crudtool.config;

import xyz.skycat.work.crudtool.exception.CrudMakeException;
import xyz.skycat.work.crudtool.facade.IfCrudMakeFacade;
import xyz.skycat.work.crudtool.facade.TableCrudMakeFacade;
import xyz.skycat.work.crudtool.facade.converter.IfStatementResultConverter;
import xyz.skycat.work.crudtool.facade.converter.TableNamesFindConverter;
import xyz.skycat.work.crudtool.output.IfCrudOutputer;
import xyz.skycat.work.crudtool.output.TsvOutputer;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by SS on 2016/06/10.
 */
public class DefaultConfiguration implements IfConfiguration {

    @Override
    public IfCrudMakeFacade createFacade() {

        return new TableCrudMakeFacade();
    }

    @Override
    public IfStatementResultConverter createConverter() {

        return new TableNamesFindConverter();
    }

    @Override
    public IfCrudOutputer createOutputer(Path outputPath) throws CrudMakeException {

        return new TsvOutputer(outputPath);
    }

}
