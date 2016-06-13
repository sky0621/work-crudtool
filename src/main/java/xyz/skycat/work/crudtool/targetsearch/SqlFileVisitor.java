package xyz.skycat.work.crudtool.targetsearch;

import xyz.skycat.work.crudtool.facade.IfCrudMakeFacade;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by SS on 2016/06/04.
 */
// parameter is Path only ...?
public class SqlFileVisitor implements FileVisitor<Path> {

    private IfCrudMakeFacade facade;

    public void setIfCrudMakeFacade(IfCrudMakeFacade facade) {

        this.facade = facade;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {

        // TODO think! what to do.
//        System.out.println("[PRE]" + dir.getFileName().toString());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

        try {
            facade.parseProcess(file);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {

        // TODO error handling.
        System.out.println("[FAILED]" + file.getFileName().toString());
        return FileVisitResult.TERMINATE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {

        // TODO think! what to do.
//        System.out.println("[POST]" + dir.getFileName().toString());
        return FileVisitResult.CONTINUE;
    }

}
