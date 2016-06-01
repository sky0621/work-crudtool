package xyz.skycat.work.crudtool;

import xyz.skycat.work.crudtool.facade.TableNamesFindFacade;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by SS on 2016/05/27.
 */
public class Main {
    // Now, 3rd step.
    public static void main(String... args) {
        // target search from args( is base directory name )

        // stream

        // parse
        String testSqlFileName = args[0];
        Path sqlFilePath = Paths.get(testSqlFileName).toAbsolutePath();

        TableNamesFindFacade facade = new TableNamesFindFacade();
        facade.output1SqlFileCrud(sqlFilePath);

        System.out.println("END");

        // aggregate

        // all done -> output ( csv or xls ? )
    }
}
