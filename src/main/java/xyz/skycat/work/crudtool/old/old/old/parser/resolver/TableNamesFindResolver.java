package xyz.skycat.work.crudtool.old.old.old.parser.resolver;

import xyz.skycat.work.crudtool.old.old.old.parser.receiver.TableNamesFindReceiver;

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
