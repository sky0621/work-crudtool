package xyz.skycat.work.crudtool.facade.statement.visitor;

import net.sf.jsqlparser.expression.*;
import net.sf.jsqlparser.expression.operators.arithmetic.*;
import net.sf.jsqlparser.expression.operators.conditional.AndExpression;
import net.sf.jsqlparser.expression.operators.conditional.OrExpression;
import net.sf.jsqlparser.expression.operators.relational.*;
import net.sf.jsqlparser.schema.Column;
import net.sf.jsqlparser.schema.Table;
import net.sf.jsqlparser.statement.select.*;
import xyz.skycat.work.crudtool.facade.sqlparser.result.IfSqlParseResult;

/**
 * Created by SS on 2016/05/28.
 */
// TODO think! DELETE, INSERT, UPDATE, MERGE, etc?
public interface IfStatementVisitor extends SelectVisitor, FromItemVisitor, ExpressionVisitor, ItemsListVisitor, IntoTableVisitor, OrderByVisitor, PivotVisitor, SelectItemVisitor {

    public IfSqlParseResult getSqlParseResult();

    // by SelectVisitor
    @Override
    default public void visit(PlainSelect plainSelect) {
        if (plainSelect.getWhere() != null) {
            plainSelect.getWhere().accept(this);
        }
    }

    // by SelectVisitor
    @Override
    default public void visit(SetOperationList setOperationList) {
        // TODO think common process
    }

    // by SelectVisitor
    @Override
    default public void visit(WithItem withItem) {
        // TODO think common process
    }

    // by FromItemVisitor
    // by IntoTableVisitor
    @Override
    default public void visit(Table table) {
        // TODO think common process
    }

    // by FromItemVisitor
    @Override
    default public void visit(SubJoin subJoin) {
        subJoin.getLeft().accept(this);
        subJoin.getJoin().getRightItem().accept(this);
    }

    // by FromItemVisitor
    @Override
    default public void visit(LateralSubSelect lateralSubSelect) {
        // TODO think common process
    }

    // by FromItemVisitor
    @Override
    default public void visit(ValuesList valuesList) {
        // TODO think common process
    }

    // by FromItemVisitor
    @Override
    default public void visit(TableFunction tableFunction) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(NullValue nullValue) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(Function function) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(SignedExpression signedExpression) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(JdbcParameter jdbcParameter) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(JdbcNamedParameter jdbcNamedParameter) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(DoubleValue doubleValue) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(LongValue longValue) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(HexValue hexValue) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(DateValue dateValue) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(TimeValue timeValue) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(TimestampValue timestampValue) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(Parenthesis parenthesis) {
        parenthesis.getExpression().accept(this);
    }

    // by ExpressionVisitor
    @Override
    default public void visit(StringValue stringValue) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(Addition addition) {
        visitBinaryExpression(addition);
    }

    // by ExpressionVisitor
    @Override
    default public void visit(Division division) {
        visitBinaryExpression(division);
    }

    // by ExpressionVisitor
    @Override
    default public void visit(Multiplication multiplication) {
        visitBinaryExpression(multiplication);
    }

    // by ExpressionVisitor
    @Override
    default public void visit(Subtraction subtraction) {
        visitBinaryExpression(subtraction);
    }

    // by ExpressionVisitor
    @Override
    default public void visit(AndExpression andExpression) {
        visitBinaryExpression(andExpression);
    }

    // by ExpressionVisitor
    @Override
    default public void visit(OrExpression orExpression) {
        visitBinaryExpression(orExpression);
    }

    // by ExpressionVisitor
    @Override
    default public void visit(Between between) {
        between.getLeftExpression().accept(this);
        between.getBetweenExpressionStart().accept(this);
        between.getBetweenExpressionEnd().accept(this);
    }

    // by ExpressionVisitor
    @Override
    default public void visit(EqualsTo equalsTo) {
        visitBinaryExpression(equalsTo);
    }

    // by ExpressionVisitor
    @Override
    default public void visit(GreaterThan greaterThan) {
        visitBinaryExpression(greaterThan);
    }

    // by ExpressionVisitor
    @Override
    default public void visit(GreaterThanEquals greaterThanEquals) {
        visitBinaryExpression(greaterThanEquals);
    }

    // by ExpressionVisitor
    @Override
    default public void visit(InExpression inExpression) {
        inExpression.getLeftExpression().accept(this);
        inExpression.getLeftItemsList().accept(this);
        inExpression.getRightItemsList().accept(this);
    }

    // by ExpressionVisitor
    @Override
    default public void visit(IsNullExpression isNullExpression) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(LikeExpression likeExpression) {
        visitBinaryExpression(likeExpression);
    }

    // by ExpressionVisitor
    @Override
    default public void visit(MinorThan minorThan) {
        visitBinaryExpression(minorThan);
    }

    // by ExpressionVisitor
    @Override
    default public void visit(MinorThanEquals minorThanEquals) {
        visitBinaryExpression(minorThanEquals);
    }

    // by ExpressionVisitor
    @Override
    default public void visit(NotEqualsTo notEqualsTo) {
        visitBinaryExpression(notEqualsTo);
    }

    // by ExpressionVisitor
    @Override
    default public void visit(Column column) {
        // TODO think common process
    }

    // by FromItemVisitor
    @Override
    default public void visit(SubSelect subSelect) {
        subSelect.getSelectBody().accept(this);
    }

    // by ExpressionVisitor
    @Override
    default public void visit(CaseExpression caseExpression) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(WhenClause whenClause) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(ExistsExpression existsExpression) {
        existsExpression.getRightExpression().accept(this);
    }

    // by ExpressionVisitor
    @Override
    default public void visit(AllComparisonExpression allComparisonExpression) {
        allComparisonExpression.getSubSelect().getSelectBody().accept(this);
    }

    // by ExpressionVisitor
    @Override
    default public void visit(AnyComparisonExpression anyComparisonExpression) {
        anyComparisonExpression.getSubSelect().getSelectBody().accept(this);
    }

    // by ExpressionVisitor
    @Override
    default public void visit(Concat concat) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(Matches matches) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(BitwiseAnd bitwiseAnd) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(BitwiseOr bitwiseOr) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(BitwiseXor bitwiseXor) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(CastExpression castExpression) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(Modulo modulo) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(AnalyticExpression analyticExpression) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(WithinGroupExpression withinGroupExpression) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(ExtractExpression extractExpression) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(IntervalExpression intervalExpression) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(OracleHierarchicalExpression oracleHierarchicalExpression) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(RegExpMatchOperator regExpMatchOperator) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(JsonExpression jsonExpression) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(RegExpMySQLOperator regExpMySQLOperator) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(UserVariable userVariable) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(NumericBind numericBind) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(KeepExpression keepExpression) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(MySQLGroupConcat mySQLGroupConcat) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(RowConstructor rowConstructor) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(OracleHint oracleHint) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(ExpressionList expressionList) {
        expressionList.getExpressions().stream().forEach(expression -> expression.accept(this));
    }

    // by ExpressionVisitor
    @Override
    default public void visit(MultiExpressionList multiExpressionList) {
        // TODO think common process
    }

    // by OrderByVisitor
    @Override
    default public void visit(OrderByElement orderByElement) {
        // TODO think common process
    }

    // by PivotVisitor
    @Override
    default public void visit(Pivot pivot) {

    }

    // by PivotVisitor
    @Override
    default public void visit(PivotXml pivotXml) {

    }

    // by SelectItemVisitor
    @Override
    default public void visit(AllColumns allColumns) {

    }

    // by SelectItemVisitor
    @Override
    default public void visit(AllTableColumns allTableColumns) {

    }

    // by SelectItemVisitor
    @Override
    default public void visit(SelectExpressionItem selectExpressionItem) {

    }

    default public void visitBinaryExpression(BinaryExpression binaryExpression) {
        binaryExpression.getLeftExpression().accept(this);
        binaryExpression.getRightExpression().accept(this);
    }

}
