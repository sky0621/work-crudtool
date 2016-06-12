package xyz.skycat.work.crudtool.facade;

import xyz.skycat.work.crudtool.facade.converter.IfStatementResultConverter;
import xyz.skycat.work.crudtool.facade.converter.TableNamesFindConverter;
import xyz.skycat.work.crudtool.facade.sqlparser.IfSqlParser;
import xyz.skycat.work.crudtool.facade.statement.resolver.IfStatementResolver;
import xyz.skycat.work.crudtool.facade.statement.resolver.TableNamesFindResolver;
import xyz.skycat.work.crudtool.facade.statement.visitor.IfStatementVisitor;
import xyz.skycat.work.crudtool.facade.statement.visitor.TableNamesFindVisitor;

/**
 * Created by SS on 2016/06/10.
 */
public class TableCrudMakeFacade extends AbstractCrudMakeFacade {

    // [Define]
    // + use SQL parser
    // + use SQL statement resolver
    // + output way ( Console ? or CSV ? or TSV ? or ... )

    public TableCrudMakeFacade() {

        super(new TableNamesFindVisitor(), new TableNamesFindResolver(), new TableNamesFindConverter());
    }

    // [Behave]
    // 1. create SQL parser
    // 2.

}
