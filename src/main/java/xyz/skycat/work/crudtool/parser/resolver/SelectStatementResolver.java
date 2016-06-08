package xyz.skycat.work.crudtool.parser.resolver;

import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.select.Select;
import xyz.skycat.work.crudtool.parser.receiver.IfStatementResolveReceiver;
import xyz.skycat.work.crudtool.parser.result.IfSqlParseResult;
import xyz.skycat.work.crudtool.type.CrudTypeEnum;

/**
 * Created by SS on 2016/06/08.
 */
public class SelectStatementResolver extends AbstractStatementResolver {

    public SelectStatementResolver(IfStatementResolveReceiver statementResolveReceiver) {

        super(statementResolveReceiver);
    }

    @Override
    public boolean isTarget(Statement statement) {
        return statement instanceof Select;
    }

    @Override
    public IfSqlParseResult resolve(Statement statement) {

        IfSqlParseResult parseResult = statementResolveReceiver.receive((Select) statement);
        parseResult.setCrudType(CrudTypeEnum.SELECT);
        return parseResult;
    }

}
