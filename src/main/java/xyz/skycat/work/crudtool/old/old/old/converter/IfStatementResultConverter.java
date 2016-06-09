package xyz.skycat.work.crudtool.old.old.old.converter;

import xyz.skycat.work.crudtool.old.old.old.parser.result.IfSqlParseResult;
import xyz.skycat.work.crudtool.old.old.old.view.IfSqlParseResultView;

/**
 * Created by SS on 2016/06/01.
 */
// TODO think! each output-method, each output-column, ... can I apply design pattern ? "Builder" ?
public interface IfStatementResultConverter {

    // each output-method.
    //   System.out
    //   File out

    // each output-column
    //   [File Name]    [C?R?U?D?]  [Table Names]...
    //   [File Name]    [C?R?U?D?]  [Table Names]...    [???]

    // YAGNI ?

    IfSqlParseResultView convert(IfSqlParseResult sqlParseResult);

}