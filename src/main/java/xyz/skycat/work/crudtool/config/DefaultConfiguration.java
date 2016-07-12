package xyz.skycat.work.crudtool.config;

import xyz.skycat.work.crudtool.exception.CrudMakeException;
import xyz.skycat.work.crudtool.facade.IfCrudMakeFacade;
import xyz.skycat.work.crudtool.facade.TableCrudMakeFacade;

/**
 * Created by SS on 2016/06/10.
 */
public class DefaultConfiguration implements IfConfiguration {

    @Override
    public void setup() {

        // TODO read config file. [ f.e. YAML ]
    }

    @Override
    public IfCrudMakeFacade buildFacade() throws CrudMakeException {

        setup();
        return new TableCrudMakeFacade();
    }

}
