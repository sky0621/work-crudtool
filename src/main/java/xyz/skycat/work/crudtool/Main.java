package xyz.skycat.work.crudtool;

import xyz.skycat.work.crudtool.facade.TableNamesFindFacade;
import xyz.skycat.work.crudtool.parser.IfSqlParser;
import xyz.skycat.work.crudtool.parser.SqlParser;
import xyz.skycat.work.crudtool.parser.result.IfSqlParseResult;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by SS on 2016/05/27.
 */
public class Main {
    // Now, 2nd step.
    public static void main(String... args) {
        // target search from args( is base directory name )

        // stream

        // parse
        String file = args[0];
        Path targetFile = Paths.get(file).toAbsolutePath();
        InputStream in = null;
        try {
            in = Files.newInputStream(targetFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        TableNamesFindFacade facade = new TableNamesFindFacade();
        List<String> tableNameList = facade.find(in);
        tableNameList.stream().forEach( System.out::println );
        System.out.println("END");
//        result.print();

        // aggregate

        // all done -> output ( csv or xls ? )
    }
}
