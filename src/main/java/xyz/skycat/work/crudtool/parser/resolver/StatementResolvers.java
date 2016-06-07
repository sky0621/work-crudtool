package xyz.skycat.work.crudtool.parser.resolver;

import net.sf.jsqlparser.statement.Statement;
import xyz.skycat.work.crudtool.parser.result.IfSqlParseResult;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by SS on 2016/06/08.
 */
public class StatementResolvers {

    private List<IfStatementResolver> statementResolvers = null;

    public StatementResolvers() {

        statementResolvers = new ArrayList<>();
        statementResolvers.add(new SelectStatementResolver());
        statementResolvers.add(new InsertStatementResolver());
        statementResolvers.add(new UpdateStatementResolver());
        statementResolvers.add(new DeleteStatementResolver());
    }

    public IfSqlParseResult resolve(Statement statement) {

        Optional<IfStatementResolver> resolverOptional = statementResolvers.parallelStream().filter(st -> st.isTarget(statement)).findFirst();
        IfStatementResolver resolver = resolverOptional.orElseThrow(() -> new IllegalArgumentException()); // TODO think! make original exception.
        return resolver.resolve(statement);
    }

}
