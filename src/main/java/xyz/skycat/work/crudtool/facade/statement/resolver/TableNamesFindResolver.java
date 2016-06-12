package xyz.skycat.work.crudtool.facade.statement.resolver;

import xyz.skycat.work.crudtool.facade.statement.receiver.TableNamesFindReceiver;
import xyz.skycat.work.crudtool.facade.statement.resolver.dml.DeleteStatementResolver;
import xyz.skycat.work.crudtool.facade.statement.resolver.dml.InsertStatementResolver;
import xyz.skycat.work.crudtool.facade.statement.resolver.dml.SelectStatementResolver;
import xyz.skycat.work.crudtool.facade.statement.resolver.dml.UpdateStatementResolver;

/**
 * Created by SS on 2016/06/09.
 */
public class TableNamesFindResolver extends StatementResolverComposite {

    public TableNamesFindResolver() {

        super();
        addStatementResolvers(new SelectStatementResolver(new TableNamesFindReceiver()));
        addStatementResolvers(new InsertStatementResolver(new TableNamesFindReceiver()));
        addStatementResolvers(new UpdateStatementResolver(new TableNamesFindReceiver()));
        addStatementResolvers(new DeleteStatementResolver(new TableNamesFindReceiver()));
    }

}
