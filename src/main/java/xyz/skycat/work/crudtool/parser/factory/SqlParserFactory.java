package xyz.skycat.work.crudtool.parser.factory;

import xyz.skycat.work.crudtool.parser.SqlParser;

/**
 * Created by SS on 2016/06/06.
 */
public class SqlParserFactory {

    public static SqlParser createSqlParser() {
        return new SqlParser();
    }

}
