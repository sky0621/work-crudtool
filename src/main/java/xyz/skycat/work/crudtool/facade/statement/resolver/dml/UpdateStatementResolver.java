package xyz.skycat.work.crudtool.facade.statement.resolver.dml;

import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.insert.Insert;
import net.sf.jsqlparser.statement.update.Update;
import xyz.skycat.work.crudtool.facade.sqlparser.result.IfSqlParseResult;
import xyz.skycat.work.crudtool.facade.statement.receiver.IfStatementReceiver;
import xyz.skycat.work.crudtool.facade.statement.resolver.AbstractStatementResolver;
import xyz.skycat.work.crudtool.facade.type.CrudTypeEnum;

/**
 * Created by SS on 2016/06/08.
 */
public class UpdateStatementResolver extends AbstractStatementResolver {

    public UpdateStatementResolver(IfStatementReceiver statementResolveReceiver) {

        super(statementResolveReceiver);
    }

    @Override
    public boolean isTarget(Statement statement) {

        return statement instanceof Update;
    }

    @Override
    public IfSqlParseResult resolve(Statement statement) {

        IfSqlParseResult parseResult = statementResolveReceiver.receive((Update) statement);
        parseResult.setCrudType(CrudTypeEnum.UPDATE);
        return parseResult;
    }

}
