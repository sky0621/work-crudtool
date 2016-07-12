package xyz.skycat.work.crudtool.config;

import xyz.skycat.work.crudtool.facade.IfCrudMakeFacade;
import xyz.skycat.work.crudtool.facade.converter.IfStatementResultConverter;
import xyz.skycat.work.crudtool.output.IfCrudOutputer;

/**
 * Created by SS on 2016/06/10.
 */
public interface IfConfiguration {

    IfCrudMakeFacade createFacade();

    IfStatementResultConverter createConverter();

    IfCrudOutputer createOutputer();

}
