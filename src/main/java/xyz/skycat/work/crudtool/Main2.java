package xyz.skycat.work.crudtool;

import xyz.skycat.work.crudtool.old.old.old.facade.IfCrudParseFacade;
import xyz.skycat.work.crudtool.old.old.old.facade.TableNamesFindFacade;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by SS on 2016/05/27.
 */
public class Main2 {
    // Now, 3rd step.
    public static void main(String... args) {

        System.out.println("<START>");

        // target search from args( is base directory name )

        // stream

        // parse
        String testSqlFileName = args[0];
        Path sqlFilePath = Paths.get(testSqlFileName).toAbsolutePath();

        IfCrudParseFacade facade = new TableNamesFindFacade();
        facade.parseProcess(sqlFilePath);

        System.out.println("<END>");

        // aggregate

        // all done -> output ( csv or xls ? )
    }
}

/*




 */