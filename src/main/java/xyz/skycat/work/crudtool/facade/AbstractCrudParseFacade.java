package xyz.skycat.work.crudtool.facade;

import xyz.skycat.work.crudtool.converter.IfStatementResultConverter;
import xyz.skycat.work.crudtool.parser.IfSqlParser;
import xyz.skycat.work.crudtool.parser.factory.SqlParserFactory;
import xyz.skycat.work.crudtool.parser.resolver.IfStatementResolver;
import xyz.skycat.work.crudtool.parser.result.IfSqlParseResult;
import xyz.skycat.work.crudtool.parser.statement.IfStatementWrapper;
import xyz.skycat.work.crudtool.parser.visitor.IfStatementVisitor;
import xyz.skycat.work.crudtool.view.IfSqlParseResultView;

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
