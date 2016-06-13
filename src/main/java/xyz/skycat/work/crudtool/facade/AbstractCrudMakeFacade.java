package xyz.skycat.work.crudtool.facade;

import xyz.skycat.work.crudtool.facade.converter.IfStatementResultConverter;
import xyz.skycat.work.crudtool.facade.exception.CrudMakeException;
import xyz.skycat.work.crudtool.facade.factory.SqlParserFactory;
import xyz.skycat.work.crudtool.facade.sqlparser.IfSqlParser;
import xyz.skycat.work.crudtool.facade.sqlparser.result.IfSqlParseResult;
import xyz.skycat.work.crudtool.facade.statement.IfStatementWrapper;
import xyz.skycat.work.crudtool.facade.statement.resolver.IfStatementResolver;
import xyz.skycat.work.crudtool.facade.statement.visitor.IfStatementVisitor;
import xyz.skycat.work.crudtool.facade.view.IfSqlParseResultView;

import java.nio.file.Path;

/**
 * Created by SS on 2016/06/13.
 */
public abstract class AbstractCrudMakeFacade implements IfCrudMakeFacade {

    private IfStatementVisitor statementVisitor;    // For parse file. Now, no use.
    private IfStatementResolver statementResolver;  // For resolve statement.
    private IfStatementResultConverter viewConverter;   // For convert parseresult to viewresult.

    public AbstractCrudMakeFacade(IfStatementVisitor statementVisitor, IfStatementResolver statementResolver, IfStatementResultConverter viewConverter) {

        this.statementVisitor = statementVisitor;
        this.statementResolver = statementResolver;
        this.viewConverter = viewConverter;
    }

    @Override
    public void parseProcess(Path sqlFilePath) throws CrudMakeException {

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
        IfSqlParseResultView view = viewConverter.convert(parseResult);
        view.output();
    }

}
