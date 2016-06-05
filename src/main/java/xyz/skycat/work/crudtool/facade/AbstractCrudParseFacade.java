package xyz.skycat.work.crudtool.facade;

import xyz.skycat.work.crudtool.converter.IfStatementResultConverter;
import xyz.skycat.work.crudtool.parser.IfSqlParser;
import xyz.skycat.work.crudtool.parser.factory.SqlParserFactory;
import xyz.skycat.work.crudtool.parser.result.IfSqlParseResult;
import xyz.skycat.work.crudtool.parser.visitor.IfStatementVisitor;
import xyz.skycat.work.crudtool.view.IfSqlParseResultView;

import java.nio.file.Path;

/**
 * Created by SS on 2016/06/06.
 */
public class AbstractCrudParseFacade implements IfCrudParseFacade {

    private Path sqlFilePath;
    private IfStatementVisitor statementVisitor;    // For parse file.
    private IfStatementResultConverter viewConverter;   // For convert parseresult to viewresult.

    public AbstractCrudParseFacade(Path sqlFilePath, IfStatementVisitor statementVisitor, IfStatementResultConverter viewConverter) {

        this.sqlFilePath = sqlFilePath;
        this.statementVisitor = statementVisitor;
        this.viewConverter = viewConverter;
    }

    @Override
    public void parseProcess() {

        IfSqlParser parser = SqlParserFactory.createSqlParser(statementVisitor);
        IfSqlParseResult parseResult = parser.parse(sqlFilePath);

        IfSqlParseResultView view = viewConverter.convert(parseResult);
        view.output();
    }

}
