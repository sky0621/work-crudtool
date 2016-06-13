package xyz.skycat.work.crudtool.facade.statement;

import net.sf.jsqlparser.statement.Statement;

/**
 * Created by SS on 2016/06/09.
 */
public class StatementWrapper implements IfStatementWrapper {

    private Statement statement;

    public StatementWrapper(Statement statement) {

        this.statement = statement;
    }

    @Override
    public Statement get() {

        return statement;
    }

}
