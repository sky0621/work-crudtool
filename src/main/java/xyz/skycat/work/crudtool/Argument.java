package xyz.skycat.work.crudtool;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by SS on 2016/06/10.
 */
public class Argument {

    public Path targetRootPath = null;
    public Path outputPath = null;

    public Argument(String... args) {

        if (args == null || args.length == 0) {
            throw new IllegalArgumentException("少なくとも解析対象のルートディレクトリ（フルパス）を指定する必要があります。");
        }

        String targetRootPathStr = args[0];
        targetRootPath = Paths.get(targetRootPathStr);

        String outputPathStr = null;
        if (args.length == 2) {
            outputPathStr = args[1];
        } else {
            outputPathStr = "crud.tsv";
        }
        if (!outputPathStr.endsWith(".tsv")) {
            outputPathStr = outputPathStr.concat(".tsv");
        }
        outputPath = Paths.get(outputPathStr);
    }

}
