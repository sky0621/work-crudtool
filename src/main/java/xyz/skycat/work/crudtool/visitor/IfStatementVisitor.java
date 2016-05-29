package xyz.skycat.work.crudtool.visitor;

import net.sf.jsqlparser.expression.*;
import net.sf.jsqlparser.expression.operators.arithmetic.*;
import net.sf.jsqlparser.expression.operators.conditional.AndExpression;
import net.sf.jsqlparser.expression.operators.conditional.OrExpression;
import net.sf.jsqlparser.expression.operators.relational.*;
import net.sf.jsqlparser.schema.Column;
import net.sf.jsqlparser.schema.Table;
import net.sf.jsqlparser.statement.select.*;

/**
 * Created by SS on 2016/05/28.
 */
// TODO think! DELETE, INSERT, UPDATE, MERGE, etc?
public interface IfStatementVisitor extends SelectVisitor, FromItemVisitor, ExpressionVisitor, ItemsListVisitor, IntoTableVisitor, OrderByVisitor {

    // by SelectVisitor
    @Override
    default public void visit(PlainSelect plainSelect) {
        // TODO think common process
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
        // TODO think common process
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
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(StringValue stringValue) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(Addition addition) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(Division division) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(Multiplication multiplication) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(Subtraction subtraction) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(AndExpression andExpression) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(OrExpression orExpression) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(Between between) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(EqualsTo equalsTo) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(GreaterThan greaterThan) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(GreaterThanEquals greaterThanEquals) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(InExpression inExpression) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(IsNullExpression isNullExpression) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(LikeExpression likeExpression) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(MinorThan minorThan) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(MinorThanEquals minorThanEquals) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(NotEqualsTo notEqualsTo) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(Column column) {
        // TODO think common process
    }

    // by FromItemVisitor
    @Override
    default public void visit(SubSelect subSelect) {
        // TODO think common process
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
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(AllComparisonExpression allComparisonExpression) {
        // TODO think common process
    }

    // by ExpressionVisitor
    @Override
    default public void visit(AnyComparisonExpression anyComparisonExpression) {
        // TODO think common process
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
        // TODO think common process
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

}
