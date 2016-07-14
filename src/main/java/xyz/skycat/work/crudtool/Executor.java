package xyz.skycat.work.crudtool;

import xyz.skycat.work.crudtool.config.IfConfiguration;
import xyz.skycat.work.crudtool.exception.CrudMakeException;
import xyz.skycat.work.crudtool.targetsearch.SqlFileVisitor;

import java.io.IOException;
import java.nio.file.Files;

/**
 * Created by SS on 2016/06/10.
 */
public class Executor {

    public void run(Argument argument, IfConfiguration configuration) throws CrudMakeException, IOException {

        SqlFileVisitor visitor = new SqlFileVisitor(configuration.createFacade());
        Files.walkFileTree(argument.targetRootPath, visitor);
        configuration.createOutputer(argument.outputPath).output(configuration.createConverter().convert(visitor.getSqlParseResultList()));
    }

}
