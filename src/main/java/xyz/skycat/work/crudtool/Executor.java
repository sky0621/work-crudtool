package xyz.skycat.work.crudtool;

import xyz.skycat.work.crudtool.config.IfConfiguration;
import xyz.skycat.work.crudtool.exception.CrudMakeException;
import xyz.skycat.work.crudtool.targetsearch.SqlFileVisitor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Created by SS on 2016/06/10.
 */
public class Executor {

    public void run(Path targetPath, IfConfiguration configuration) throws CrudMakeException, IOException {

        SqlFileVisitor visitor = new SqlFileVisitor(configuration.createFacade());
        Files.walkFileTree(targetPath, visitor);
        configuration.createOutputer().output(configuration.createConverter().convert(visitor.getSqlParseResultList()));
    }

}
