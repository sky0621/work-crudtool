package xyz.skycat.work.crudtool.facade;

import net.sf.jsqlparser.statement.select.Select;
import xyz.skycat.work.crudtool.converter.IfStatementResultConverter;
import xyz.skycat.work.crudtool.converter.StatementResultConverter;
import xyz.skycat.work.crudtool.parser.IfSqlParser;
import xyz.skycat.work.crudtool.parser.SqlParser;
import xyz.skycat.work.crudtool.parser.result.IfSqlParseResult;
import xyz.skycat.work.crudtool.visitor.IfStatementVisitor;
import xyz.skycat.work.crudtool.visitor.TableNamesFindVisitor;

import java.io.InputStream;
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

    @Deprecated
    public List<String> find(String sql) {

        IfSqlParser parser = new SqlParser();
        IfSqlParseResult result = parser.parse(sql);
        if(!(result.getStatement() instanceof Select)) {
            return null;
        }
        Select selectStatement = (Select)result.getStatement();

        IfStatementVisitor finder = new TableNamesFindVisitor();
        selectStatement.getSelectBody().accept(finder);

        IfStatementResultConverter converter = new StatementResultConverter();
        tableNameList = converter.convertToTableNameList(finder.getStatementVisitResult());

        return tableNameList;
    }

    public List<String> find(InputStream sqlInputStream) {

        IfSqlParser parser = new SqlParser();
        IfSqlParseResult result = parser.parse(sqlInputStream);
        if(!(result.getStatement() instanceof Select)) {
            return null;
        }
        Select selectStatement = (Select)result.getStatement();

        IfStatementVisitor finder = new TableNamesFindVisitor();
        selectStatement.getSelectBody().accept(finder);

        IfStatementResultConverter converter = new StatementResultConverter();
        tableNameList = converter.convertToTableNameList(finder.getStatementVisitResult());

        return tableNameList;
    }

}
