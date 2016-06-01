package xyz.skycat.work.crudtool.parser;

import xyz.skycat.work.crudtool.parser.result.IfSqlParseResult;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Path;

/**
 * Created by SS on 2016/05/27.
 */
public interface IfSqlParser {

    IfSqlParseResult parse(Path sqlFilePath);

}
