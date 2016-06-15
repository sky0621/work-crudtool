package xyz.skycat.work.crudtool.config;

import xyz.skycat.work.crudtool.facade.IfCrudMakeFacade;
import xyz.skycat.work.crudtool.facade.TableCrudMakeFacade;
import xyz.skycat.work.crudtool.facade.exception.CrudMakeException;
import xyz.skycat.work.crudtool.output.ConsoleOutputer;
import xyz.skycat.work.crudtool.output.IfCrudOutputer;

/**
 * Created by SS on 2016/06/10.
 */
public class DefaultConfiguration implements IfConfiguration {

    private IfCrudOutputer outputer;

    @Override
    public void setup() {

        // TODO read config file. [ f.e. YAML ]

        this.outputer = new ConsoleOutputer();
    }

    @Override
    public IfCrudMakeFacade buildFacade() throws CrudMakeException {

        setup();
        return new TableCrudMakeFacade(this.outputer);
    }

}
