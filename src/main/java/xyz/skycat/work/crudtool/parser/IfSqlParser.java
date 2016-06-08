package xyz.skycat.work.crudtool.parser;

import xyz.skycat.work.crudtool.parser.statement.IfStatementWrapper;

import java.nio.file.Path;

/**
 * Created by SS on 2016/05/27.
 */
public interface IfSqlParser {

    IfStatementWrapper parse(Path sqlFilePath);

}
