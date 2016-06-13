package xyz.skycat.work.crudtool.facade.exception;

import java.nio.file.Path;

/**
 * Created by SS on 2016/06/14.
 */
public class CrudMakeException extends Exception {

    private Path sqlFilePath;

    public CrudMakeException() {

    }

    public CrudMakeException(Path sqlFilePath) {

        this.sqlFilePath = sqlFilePath;
    }

    public CrudMakeException(Exception e) {

        super(e);
    }

    public CrudMakeException(Path sqlFilePath, Exception e) {

        super(e);
        this.sqlFilePath = sqlFilePath;
    }

    public CrudMakeException(String message, Path sqlFilePath) {

        super(message);
        this.sqlFilePath = sqlFilePath;
    }

    public CrudMakeException(String message) {

        super(message);
    }

    public Path getSqlFilePath() {

        return sqlFilePath;
    }

    public String getSqlFileFullPath() {

        return sqlFilePath.normalize().toAbsolutePath().toString();
    }

}
