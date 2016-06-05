package xyz.skycat.work.crudtool.parser.factory;

import xyz.skycat.work.crudtool.parser.SqlParser;
import xyz.skycat.work.crudtool.parser.visitor.IfStatementVisitor;

/**
 * Created by SS on 2016/06/06.
 */
public class SqlParserFactory {

    public static SqlParser createSqlParser(IfStatementVisitor statementVisitor) {
        return new SqlParser(statementVisitor);
    }

}
