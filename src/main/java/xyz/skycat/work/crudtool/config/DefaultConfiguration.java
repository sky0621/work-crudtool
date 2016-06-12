package xyz.skycat.work.crudtool.config;

import xyz.skycat.work.crudtool.facade.IfCrudMakeFacade;
import xyz.skycat.work.crudtool.facade.TableCrudMakeFacade;

/**
 * Created by SS on 2016/06/10.
 */
public class DefaultConfiguration implements IfConfiguration {

    @Override
    public IfCrudMakeFacade buildFacade() {

        return new TableCrudMakeFacade();
    }

}
