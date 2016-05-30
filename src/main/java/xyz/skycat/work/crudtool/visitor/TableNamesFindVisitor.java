package xyz.skycat.work.crudtool.visitor;

import net.sf.jsqlparser.schema.Table;
import net.sf.jsqlparser.statement.select.PlainSelect;
import xyz.skycat.work.crudtool.visitor.result.IfStatementVisitResult;
import xyz.skycat.work.crudtool.visitor.result.StatementVisitResult;

/**
 * Created by SS on 2016/05/28.
 */
public class TableNamesFindVisitor implements IfStatementVisitor {

    private IfStatementVisitResult statementVisitResult = null;

    public TableNamesFindVisitor() {
        statementVisitResult = new StatementVisitResult();
    }

    @Override
    public IfStatementVisitResult getStatementVisitResult() {
        return statementVisitResult;
    }

    // by SelectVisitor
    @Override
    public void visit(PlainSelect plainSelect) {
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
        statementVisitResult.addTableName(table.getFullyQualifiedName());
    }

}
