package xyz.skycat.work.crudtool.parser.resolver;

import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.delete.Delete;
import xyz.skycat.work.crudtool.parser.result.IfSqlParseResult;

/**
 * Created by SS on 2016/06/08.
 */
public class DeleteStatementResolver implements IfStatementResolver {

    @Override
    public boolean isTarget(Statement statement) {
        return statement instanceof Delete;
    }

    @Override
    public IfSqlParseResult resolve(Statement statement) {
        return null;
    }

}
