package xyz.skycat.work.crudtool.facade;

import xyz.skycat.work.crudtool.enums.FunctionKind;
import xyz.skycat.work.crudtool.facade.exception.CrudMakeException;
import xyz.skycat.work.crudtool.output.IfCrudOutputer;

/**
 * Created by SS on 2016/06/10.
 */
public class TableCrudMakeFacade extends AbstractCrudMakeFacade {

    public TableCrudMakeFacade(IfCrudOutputer outputer) throws CrudMakeException {

        super(FunctionKind.TABLE_NAMES_FIND, outputer);
    }

}
