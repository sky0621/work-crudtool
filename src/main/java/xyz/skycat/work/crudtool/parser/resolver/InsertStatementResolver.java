package xyz.skycat.work.crudtool.parser.resolver;

import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.insert.Insert;
import xyz.skycat.work.crudtool.parser.receiver.IfStatementResolveReceiver;
import xyz.skycat.work.crudtool.parser.result.IfSqlParseResult;

/**
 * Created by SS on 2016/06/08.
 */
public class InsertStatementResolver extends AbstractStatementResolver {

    public InsertStatementResolver(IfStatementResolveReceiver statementResolveReceiver) {

        super(statementResolveReceiver);
    }

    @Override
    public boolean isTarget(Statement statement) {
        return statement instanceof Insert;
    }

    @Override
    public IfSqlParseResult resolve(Statement statement) {
        return null;
    }

}
