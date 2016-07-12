package xyz.skycat.work.crudtool.facade;

import xyz.skycat.work.crudtool.exception.CrudMakeException;
import xyz.skycat.work.crudtool.facade.factory.SqlParserFactory;
import xyz.skycat.work.crudtool.facade.sqlparser.IfSqlParser;
import xyz.skycat.work.crudtool.facade.sqlparser.result.IfSqlParseResult;
import xyz.skycat.work.crudtool.facade.statement.IfStatementWrapper;
import xyz.skycat.work.crudtool.facade.statement.resolver.IfStatementResolver;

import java.nio.file.Path;

/**
 * Created by SS on 2016/06/13.
 */
public abstract class AbstractCrudMakeFacade implements IfCrudMakeFacade {

    private IfStatementResolver statementResolver;  // For resolve statement.

    public AbstractCrudMakeFacade(IfStatementResolver statementResolver) throws CrudMakeException {

        this.statementResolver = statementResolver;
    }

    @Override
    public IfSqlParseResult parseProcess(Path sqlFilePath) throws CrudMakeException {

        if (sqlFilePath == null) {
            // TODO log
            throw new CrudMakeException(new IllegalArgumentException("sqlFilePath is null"));
        }

        IfSqlParser parser = SqlParserFactory.createSqlParser();
        IfStatementWrapper statementWrapper = parser.parse(sqlFilePath);
        IfSqlParseResult parseResult = statementResolver.resolve(statementWrapper.get());
        if (parseResult == null) {
            // TODO log
            throw new CrudMakeException("SqlParseResult is null", sqlFilePath);
        }
        parseResult.setSqlFileName(sqlFilePath);   // TODO Muuuuu...
        return parseResult;
    }

}
