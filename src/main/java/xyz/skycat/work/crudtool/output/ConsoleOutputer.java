package xyz.skycat.work.crudtool.output;

import xyz.skycat.work.crudtool.facade.type.CrudTypeEnum;

import java.util.stream.Stream;

/**
 * Created by SS on 2016/06/15.
 */
public class ConsoleOutputer implements IfCrudOutputer {

    private String sqlFileName;

    private CrudTypeEnum crudType;

    private Stream strm;

    @Override
    public void output() {
        System.out.print(String.format("%s\t", sqlFileName));
        strm.forEachOrdered(tableName -> {
            System.out.print(String.format("%s\t", tableName));
        });
        System.out.print("\n");
        strm.forEachOrdered(tableName -> {
            System.out.print(String.format("\t%s", crudType.alias()));
        });
        System.out.print("\n");
    }

    @Override
    public void setSqlFileName(String sqlFileName) {
        this.sqlFileName = sqlFileName;
    }

    @Override
    public String getSqlFileName() {
        return sqlFileName;
    }

    @Override
    public void setCrudType(CrudTypeEnum crudType) {
        this.crudType = crudType;
    }

    @Override
    public CrudTypeEnum getCrudType() {
        return crudType;
    }

    @Override
    public void setStreamData(Stream strm) {
        this.strm = strm;
    }

    @Override
    public Stream getStreamData() {
        return strm;
    }

}
