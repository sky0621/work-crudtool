package xyz.skycat.work.crudtool.parser.result;

import net.sf.jsqlparser.statement.Statement;

/**
 * Created by SS on 2016/05/27.
 */
public interface IfSqlParseResult {

    void setStatement(Statement stmt);

    Statement getStatement();

}
