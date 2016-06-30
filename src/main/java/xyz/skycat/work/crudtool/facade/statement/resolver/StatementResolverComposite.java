package xyz.skycat.work.crudtool.facade.statement.resolver;

import net.sf.jsqlparser.statement.Statement;
import xyz.skycat.work.crudtool.exception.CrudMakeException;
import xyz.skycat.work.crudtool.facade.sqlparser.result.IfSqlParseResult;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by SS on 2016/06/08.
 */
public class StatementResolverComposite implements IfStatementResolver {

    private List<IfStatementResolver> statementResolvers = null;

    public StatementResolverComposite() {

        statementResolvers = new ArrayList<>();
    }

    protected void addStatementResolvers(IfStatementResolver statementResolver) {

        statementResolvers.add(statementResolver);
    }

    @Override
    public IfSqlParseResult resolve(Statement statement) throws CrudMakeException {

        Optional<IfStatementResolver> resolverOptional = statementResolvers.parallelStream().filter(st -> st.isTarget(statement)).findFirst();
        IfStatementResolver resolver = resolverOptional.orElseThrow(() -> new CrudMakeException("StatementResolve error occured"));
        return resolver.resolve(statement);
    }

}
