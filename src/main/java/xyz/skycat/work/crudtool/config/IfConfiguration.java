package xyz.skycat.work.crudtool.config;

import xyz.skycat.work.crudtool.facade.IfCrudMakeFacade;

/**
 * Created by SS on 2016/06/10.
 */
public interface IfConfiguration {

    IfCrudMakeFacade buildFacade();

}
