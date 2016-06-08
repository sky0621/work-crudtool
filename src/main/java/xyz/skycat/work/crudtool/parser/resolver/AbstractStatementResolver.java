package xyz.skycat.work.crudtool.parser.resolver;

import xyz.skycat.work.crudtool.parser.receiver.IfStatementResolveReceiver;

/**
 * Created by SS on 2016/06/09.
 */
public abstract class AbstractStatementResolver implements IfStatementResolver {

    protected IfStatementResolveReceiver statementResolveReceiver;

    public AbstractStatementResolver(IfStatementResolveReceiver statementResolveReceiver) {

        this.statementResolveReceiver = statementResolveReceiver;
    }

}
