package xyz.skycat.work.crudtool.old.old.old.facade;

import xyz.skycat.work.crudtool.old.old.old.converter.TableNamesFindConverter;
import xyz.skycat.work.crudtool.old.old.old.parser.resolver.TableNamesFindResolver;
import xyz.skycat.work.crudtool.old.old.old.parser.visitor.TableNamesFindVisitor;

/**
 * Created by SS on 2016/05/31.
 */
// Is this facade?
public class TableNamesFindFacade extends AbstractCrudParseFacade {

    public TableNamesFindFacade() {

        super(new TableNamesFindVisitor(), new TableNamesFindResolver(), new TableNamesFindConverter());
    }

}
