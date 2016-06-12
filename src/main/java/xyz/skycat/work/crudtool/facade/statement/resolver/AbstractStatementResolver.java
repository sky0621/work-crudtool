package xyz.skycat.work.crudtool.facade.statement.resolver;

import xyz.skycat.work.crudtool.facade.statement.receiver.IfStatementReceiver;

/**
 * Created by SS on 2016/06/09.
 */
public abstract class AbstractStatementResolver implements IfStatementResolver {

    protected IfStatementReceiver statementResolveReceiver;

    public AbstractStatementResolver(IfStatementReceiver statementResolveReceiver) {

        this.statementResolveReceiver = statementResolveReceiver;
    }

}
