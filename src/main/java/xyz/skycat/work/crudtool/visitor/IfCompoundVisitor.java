package xyz.skycat.work.crudtool.visitor;

import net.sf.jsqlparser.statement.select.*;

/**
 * Created by SS on 2016/05/28.
 */
// TODO think! DELETE, INSERT, UPDATE, MERGE, etc?
public interface IfCompoundVisitor extends SelectVisitor, FromItemVisitor, IntoTableVisitor, OrderByVisitor, PivotVisitor, SelectItemVisitor {
}
