package xyz.skycat.work.crudtool.parser.result;

import net.sf.jsqlparser.statement.Statement;

/**
 * Created by SS on 2016/05/27.
 */
public class SqlParseResult implements IfSqlParseResult {

    private Statement statement;

    // TODO add Converter field. or Converter is out.

    @Override
    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    @Override
    public Statement getStatement() {
        return statement;
    }

}
