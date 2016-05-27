package xyz.skycat.work.crudtool;

import xyz.skycat.work.crudtool.parser.IfSqlParser;
import xyz.skycat.work.crudtool.parser.SqlParser;
import xyz.skycat.work.crudtool.parser.result.IfSqlParseResult;

/**
 * Created by SS on 2016/05/27.
 */
public class Main {
    public static void main(String... args) {
        // target search from args( is base directory name )

        // stream

        // parse
        String sql = "SELECT it.* FROM fs_mst_item it INNER JOIN fs_mst_category ct ON ct.category_id = it.category_id WHERE it.value > 100 ORDER BY it.value DESC";    // Sample
        IfSqlParser parser = new SqlParser();
        IfSqlParseResult result = parser.parse(sql);
        System.out.println("END");
//        result.print();

        // aggregate

        // all done -> output ( csv or xls ? )
    }
}
