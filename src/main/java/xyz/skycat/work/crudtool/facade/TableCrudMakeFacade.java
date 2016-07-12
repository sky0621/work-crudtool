package xyz.skycat.work.crudtool.facade;

import xyz.skycat.work.crudtool.exception.CrudMakeException;
import xyz.skycat.work.crudtool.facade.statement.resolver.TableNamesFindResolver;

/**
 * Created by SS on 2016/06/10.
 */
public class TableCrudMakeFacade extends AbstractCrudMakeFacade {

    public TableCrudMakeFacade() {

        super(new TableNamesFindResolver());
    }

}
