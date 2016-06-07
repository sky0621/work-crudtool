package xyz.skycat.work.crudtool.parser.resolver;

import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.update.Update;
import xyz.skycat.work.crudtool.parser.result.IfSqlParseResult;

/**
 * Created by SS on 2016/06/08.
 */
public class UpdateStatementResolver implements IfStatementResolver {

    @Override
    public boolean isTarget(Statement statement) {
        return statement instanceof Update;
    }

    @Override
    public IfSqlParseResult resolve(Statement statement) {
        return null;
    }

}
