package xyz.skycat.work.crudtool.visitor;

import net.sf.jsqlparser.schema.Table;
import net.sf.jsqlparser.statement.select.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SS on 2016/05/28.
 */
public class TableNamesFinder implements IfStatementVisitor {

    private List<String> tableNameList = null;

    public List<String> getTableNameList(Select select) {
        tableNameList = new ArrayList<>();
        select.getSelectBody().accept(this);
        return tableNameList;
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
        tableNameList.add(table.getFullyQualifiedName());
    }

    // by FromItemVisitor
    @Override
    public void visit(SubSelect subSelect) {
        subSelect.getSelectBody().accept(this);
    }

}
