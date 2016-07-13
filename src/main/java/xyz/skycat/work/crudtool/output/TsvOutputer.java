package xyz.skycat.work.crudtool.output;

import xyz.skycat.work.crudtool.exception.CrudMakeException;
import xyz.skycat.work.crudtool.facade.view.IfSqlParseResultBodyView;
import xyz.skycat.work.crudtool.facade.view.IfSqlParseResultHeaderView;
import xyz.skycat.work.crudtool.facade.view.IfSqlParseResultView;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 * Created by SS on 2016/06/15.
 */
public class TsvOutputer implements IfCrudOutputer {

    private Path outputFilePath;

    public TsvOutputer(Path outputFilePath) throws CrudMakeException {

        this.outputFilePath = outputFilePath;
        try {
            Files.deleteIfExists(this.outputFilePath);
            Files.createFile(this.outputFilePath);
        } catch (IOException e) {
            throw new CrudMakeException("TSVファイル「" + outputFilePath == null ? "<無し>" : outputFilePath.toString() + "」の再生成に失敗しました。", e);
        }
    }

    @Override
    public void output(IfSqlParseResultView view) throws CrudMakeException {

        try (BufferedWriter writer = Files.newBufferedWriter(outputFilePath, StandardOpenOption.APPEND)) {

            IfSqlParseResultHeaderView header = view.getHeader();
            writer.write(header.getLabel() + "\t");
            for (String tableName : header.getTableNameList()) {
                writer.write(tableName + "\t");
            }
            writer.write("\n");

            for (IfSqlParseResultBodyView body : view.getBodyList()) {
                writer.write(body.getSqlFileName() + "\t");
                for (String crud : body.getTableCrudList()) {
                    writer.write(crud + "\t");
                }
                writer.write("\n");
            }

            writer.flush();
        } catch (IOException e) {
            throw new CrudMakeException("TSVファイル「" + outputFilePath.toString() + "」への出力に失敗しました。", e);
        }
    }

}
