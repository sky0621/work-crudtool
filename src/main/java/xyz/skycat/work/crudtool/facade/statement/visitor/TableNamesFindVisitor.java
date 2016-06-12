package xyz.skycat.work.crudtool.facade.statement.visitor;

import net.sf.jsqlparser.schema.Table;
import net.sf.jsqlparser.statement.select.PlainSelect;
import xyz.skycat.work.crudtool.facade.sqlparser.result.IfSqlParseResult;
import xyz.skycat.work.crudtool.facade.sqlparser.result.TableNamesFindSqlParseResult;

import java.util.List;

/**
 * Created by SS on 2016/05/28.
 */
// TODO Oops ! Already provided "TablesNamesFinder". So, this class is no use.
public class TableNamesFindVisitor implements IfStatementVisitor {

    private IfSqlParseResult sqlParseResult = null;

    public TableNamesFindVisitor() {
        sqlParseResult = new TableNamesFindSqlParseResult();
    }

    @Override
    public IfSqlParseResult getSqlParseResult() {
        return sqlParseResult;
    }

    // by SelectVisitor
    @Override
    public void visit(PlainSelect plainSelect) {
        // TODO think! avoid if statement.
        if (plainSelect.getFromItem() != null) {
            plainSelect.getFromItem().accept(this);
        }
        if (plainSelect.getJoins() != null) {
            plainSelect.getJoins().stream().forEach(join -> join.getRightItem().accept(this));
        }
        if (plainSelect.getWhere() != null) {
            plainSelect.getWhere().accept(this);
        }
        // TODO Nothing other ?
    }

    // by FromItemVisitor
    // by IntoTableVisitor
    @Override
    public void visit(Table table) {
        List<String> res = (List<String>) sqlParseResult.getResult();
        res.add(table.getFullyQualifiedName());
//        sqlParseResult.addTableName(table.getFullyQualifiedName());
    }

}
