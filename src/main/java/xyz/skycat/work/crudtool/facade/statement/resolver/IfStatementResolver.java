package xyz.skycat.work.crudtool.facade.statement.resolver;

import net.sf.jsqlparser.statement.Statement;
import xyz.skycat.work.crudtool.old.old.old.parser.result.IfSqlParseResult;

/**
 * Created by SS on 2016/06/08.
 */
public interface IfStatementResolver {

    public default boolean isTarget(Statement statement) {

        return true;
    }

    public IfSqlParseResult resolve(Statement statement);

}