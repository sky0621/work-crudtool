package xyz.skycat.work.crudtool.facade;

import xyz.skycat.work.crudtool.converter.TableNamesConverter;
import xyz.skycat.work.crudtool.parser.visitor.TableNamesFindVisitor;

import java.nio.file.Path;

/**
 * Created by SS on 2016/05/31.
 */
// Is this facade?
public class TableNamesFindFacade extends AbstractCrudParseFacade {

    public TableNamesFindFacade(Path sqlFilePath) {

        super(sqlFilePath, new TableNamesFindVisitor(), new TableNamesConverter());
    }

}
