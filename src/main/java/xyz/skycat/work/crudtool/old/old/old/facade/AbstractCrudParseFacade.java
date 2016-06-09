package xyz.skycat.work.crudtool.old.old.old.facade;

import xyz.skycat.work.crudtool.old.old.old.converter.IfStatementResultConverter;
import xyz.skycat.work.crudtool.old.old.old.parser.IfSqlParser;
import xyz.skycat.work.crudtool.old.old.old.parser.factory.SqlParserFactory;
import xyz.skycat.work.crudtool.old.old.old.parser.resolver.IfStatementResolver;
import xyz.skycat.work.crudtool.old.old.old.parser.result.IfSqlParseResult;
import xyz.skycat.work.crudtool.old.old.old.parser.statement.IfStatementWrapper;
import xyz.skycat.work.crudtool.old.old.old.parser.visitor.IfStatementVisitor;
import xyz.skycat.work.crudtool.old.old.old.view.IfSqlParseResultView;

import java.nio.file.Path;

/**
 * Created by SS on 2016/06/06.
 */
public class AbstractCrudParseFacade implements IfCrudParseFacade {

    private IfStatementVisitor statementVisitor;    // For parse file. Now, no use.
    private IfStatementResolver statementResolver;  // For resolve statement.
    private IfStatementResultConverter viewConverter;   // For convert parseresult to viewresult.

    public AbstractCrudParseFacade(IfStatementVisitor statementVisitor, IfStatementResolver statementResolver, IfStatementResultConverter viewConverter) {

        this.statementVisitor = statementVisitor;
        this.statementResolver = statementResolver;
        this.viewConverter = viewConverter;
    }

    @Override
    public void parseProcess(Path sqlFilePath) {

        IfSqlParser parser = SqlParserFactory.createSqlParser();
        IfStatementWrapper statementWrapper = parser.parse(sqlFilePath);
        IfSqlParseResult parseResult = statementResolver.resolve(statementWrapper.get());
        IfSqlParseResultView view = viewConverter.convert(parseResult);
        view.output();
    }

}
