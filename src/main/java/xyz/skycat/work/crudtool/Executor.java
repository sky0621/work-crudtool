package xyz.skycat.work.crudtool;

import xyz.skycat.work.crudtool.config.DefaultConfiguration;
import xyz.skycat.work.crudtool.config.IfConfiguration;
import xyz.skycat.work.crudtool.facade.IfCrudMakeFacade;
import xyz.skycat.work.crudtool.targetsearch.SqlFileVisitor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Created by SS on 2016/06/10.
 */
public class Executor {

    IfConfiguration configuration;

    public Executor() {
        this.configuration = new DefaultConfiguration();
    }

    public Executor(IfConfiguration configuration) {
        this.configuration = configuration;
    }

    public void run(Path targetPath) {

        IfCrudMakeFacade facade = this.configuration.buildFacade();
        SqlFileVisitor visitor = new SqlFileVisitor();
        visitor.setIfCrudMakeFacade(facade);
        try {
            Files.walkFileTree(targetPath, visitor);
        } catch (IOException e) {
            // TODO error handling.
            e.printStackTrace();
        }
    }

}
