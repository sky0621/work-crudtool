package xyz.skycat.work.crudtool.facade;

import net.sf.jsqlparser.statement.select.Select;
import xyz.skycat.work.crudtool.converter.IfStatementResultConverter;
import xyz.skycat.work.crudtool.converter.StatementResultConverter;
import xyz.skycat.work.crudtool.parser.IfSqlParser;
import xyz.skycat.work.crudtool.parser.SqlParser;
import xyz.skycat.work.crudtool.parser.factory.SqlParserFactory;
import xyz.skycat.work.crudtool.parser.result.IfSqlParseResult;
import xyz.skycat.work.crudtool.parser.visitor.IfStatementVisitor;
import xyz.skycat.work.crudtool.parser.visitor.TableNamesFindVisitor;
import xyz.skycat.work.crudtool.view.IfSqlParseResultView;
import xyz.skycat.work.crudtool.view.SqlParseResultView;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by SS on 2016/05/31.
 */
// Is this facade?
public class TableNamesFindFacade {

    private List<String> tableNameList = null;

    public TableNamesFindFacade() {
        tableNameList = new ArrayList<>();
    }

    // TODO think! good name.
    public void output1SqlFileCrud(Path sqlFilePath) {

        IfSqlParser parser = SqlParserFactory.createSqlParser(new TableNamesFindVisitor());
        IfSqlParseResult parseResult = parser.parse(sqlFilePath);

        IfStatementResultConverter converter = new StatementResultConverter();
        IfSqlParseResultView view = converter.convertToTableNameList(parseResult);
        view.output();
    }

}
