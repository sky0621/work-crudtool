package xyz.skycat.work.crudtool.facade.sqlparser;

import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;
import xyz.skycat.work.crudtool.exception.CrudMakeException;
import xyz.skycat.work.crudtool.facade.statement.IfStatementWrapper;
import xyz.skycat.work.crudtool.facade.statement.StatementWrapper;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Created by SS on 2016/05/27.
 */
public class SqlParser implements IfSqlParser {

    @Override
    public IfStatementWrapper parse(Path sqlFilePath) throws CrudMakeException {

        InputStream sqlInputStream = null;
        try {
            sqlInputStream = Files.newInputStream(sqlFilePath);
        } catch (IOException e) {
            throw new CrudMakeException("SQLファイルを入力ストリームに変換できませんでした。", sqlFilePath, e);
        }

        Statement stmt = null;
        try {
            stmt = CCJSqlParserUtil.parse(sqlInputStream);
        } catch (JSQLParserException e) {
            throw new CrudMakeException("CCJSqlParserによるパースに失敗しました。", sqlFilePath, e);
        }

        return new StatementWrapper(stmt);
    }

}
