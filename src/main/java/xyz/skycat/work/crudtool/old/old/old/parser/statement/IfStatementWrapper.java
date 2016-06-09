package xyz.skycat.work.crudtool.old.old.old.parser.statement;

import net.sf.jsqlparser.statement.Statement;

/**
 * Created by SS on 2016/06/09.
 */
public interface IfStatementWrapper {

    public IfStatementWrapper set(Statement statement);

    public Statement get();

}
