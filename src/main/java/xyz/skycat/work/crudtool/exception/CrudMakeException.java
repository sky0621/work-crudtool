package xyz.skycat.work.crudtool.exception;

import java.nio.file.Path;

/**
 * Created by SS on 2016/06/14.
 */
public class CrudMakeException extends Exception {

    private Path sqlFilePath;

    public CrudMakeException() {

    }

    public CrudMakeException(String message) {

        super(message);
    }

    public CrudMakeException(Path sqlFilePath) {

        super("[SQLファイルパス：" + sqlFilePath + "]");
        this.sqlFilePath = sqlFilePath;
    }

    public CrudMakeException(Exception e) {

        super(e);
    }

    public CrudMakeException(String message, Path sqlFilePath) {

        super(String.format("%s [SQLファイルパス：%s]", message, sqlFilePath.getFileName().toString()));
        this.sqlFilePath = sqlFilePath;
    }

    public CrudMakeException(String message, Exception e) {

        super(message, e);
    }

    public CrudMakeException(Path sqlFilePath, Exception e) {

        super("[SQLファイルパス：" + sqlFilePath + "]", e);
        this.sqlFilePath = sqlFilePath;
    }

    public CrudMakeException(String message, Path sqlFilePath, Exception e) {

        super(String.format("%s [SQLファイルパス：%s]", message, sqlFilePath.getFileName().toString()), e);
        this.sqlFilePath = sqlFilePath;
    }

    public Path getSqlFilePath() {

        return sqlFilePath;
    }

    public String getSqlFileFullPath() {

        return sqlFilePath.normalize().toAbsolutePath().toString();
    }

}
