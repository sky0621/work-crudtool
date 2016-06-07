package xyz.skycat.work.crudtool.parser.resolver;

import net.sf.jsqlparser.statement.Statement;
import xyz.skycat.work.crudtool.parser.result.IfSqlParseResult;

/**
 * Created by SS on 2016/06/08.
 */
public interface IfStatementResolver {

    public boolean isTarget(Statement statement);

    public IfSqlParseResult resolve(Statement statement);

}
