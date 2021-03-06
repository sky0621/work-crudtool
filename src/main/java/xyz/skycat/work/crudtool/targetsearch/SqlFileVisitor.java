package xyz.skycat.work.crudtool.targetsearch;

import xyz.skycat.work.crudtool.exception.CrudMakeException;
import xyz.skycat.work.crudtool.facade.IfCrudMakeFacade;
import xyz.skycat.work.crudtool.facade.sqlparser.result.IfSqlParseResult;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by SS on 2016/06/04.
 */
// parameter is Path only ...?
public class SqlFileVisitor implements FileVisitor<Path> {

    private IfCrudMakeFacade facade;
    private List<IfSqlParseResult> sqlParseResultList;

    public SqlFileVisitor(IfCrudMakeFacade facade) {

        this.facade = facade;
        sqlParseResultList = new ArrayList<>();
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {

        // TODO think! what to do.
//        System.out.println("[PRE]" + dir.getFileName().toString());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

        if (file == null) {
            return FileVisitResult.CONTINUE;
        }
        if (!file.toString().endsWith(".sql")) {
            return FileVisitResult.CONTINUE;
        }
        try {
            IfSqlParseResult result = facade.parseProcess(file);
            if (result != null) {
                sqlParseResultList.add(result);
            }
        } catch (Throwable t) {
            t.printStackTrace();
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

    public List<IfSqlParseResult> getSqlParseResultList() {
        return sqlParseResultList;
    }

}
