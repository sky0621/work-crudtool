package xyz.skycat.work.crudtool.output;

import xyz.skycat.work.crudtool.facade.view.IfSqlParseResultView;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

/**
 * Created by SS on 2016/06/15.
 */
public class TsvOutputer implements IfCrudOutputer {

    private Path outputFilePath;

    public TsvOutputer(Path outputFilePath) {

        this.outputFilePath = outputFilePath;
        try {
            Files.deleteIfExists(this.outputFilePath);
            Files.createFile(this.outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void output(List<IfSqlParseResultView> viewList) {

        try (BufferedWriter writer = Files.newBufferedWriter(outputFilePath, StandardOpenOption.APPEND)) {

            viewList.stream().forEach(view -> {

                // FIXME .....................!!!!
//                writer.write(String.format("%s\t", view.getSqlFileName()));
            });
//            writer.write(String.format("%s\t", getSqlFileName()));
//            getStreamData().forEach(tableName -> {
//                try {
//                    writer.write(String.format("%s(%s)\t", tableName, getCrudType().alias()));
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            });
            writer.write("\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
