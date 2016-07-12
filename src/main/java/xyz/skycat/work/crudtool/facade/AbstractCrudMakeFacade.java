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

    public AbstractCrudMakeFacade(IfStatementResolver statementResolver) {

        this.statementResolver = statementResolver;
    }

    @Override
    public IfSqlParseResult parseProcess(Path sqlFilePath) throws CrudMakeException {

        if (sqlFilePath == null) {
            throw new CrudMakeException("SQLファイルパスが渡されていません。");
        }

        IfStatementWrapper statementWrapper = SqlParserFactory.createSqlParser().parse(sqlFilePath);
        IfSqlParseResult parseResult = statementResolver.resolve(statementWrapper.get());
        if (parseResult == null) {
            throw new CrudMakeException("SQLパース結果が null です。", sqlFilePath);
        }
        parseResult.setSqlFileName(sqlFilePath);   // TODO Muuuuu...
        return parseResult;
    }

}
