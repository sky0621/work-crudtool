package xyz.skycat.work.crudtool.facade.statement.resolver.dml;

import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.delete.Delete;
import xyz.skycat.work.crudtool.facade.sqlparser.result.IfSqlParseResult;
import xyz.skycat.work.crudtool.facade.statement.receiver.IfStatementReceiver;
import xyz.skycat.work.crudtool.facade.statement.resolver.AbstractStatementResolver;

/**
 * Created by SS on 2016/06/08.
 */
public class DeleteStatementResolver extends AbstractStatementResolver {

    public DeleteStatementResolver(IfStatementReceiver statementResolveReceiver) {

        super(statementResolveReceiver);
    }

    @Override
    public boolean isTarget(Statement statement) {

        return statement instanceof Delete;
    }

    @Override
    public IfSqlParseResult resolve(Statement statement) {

        return null;
    }

}
