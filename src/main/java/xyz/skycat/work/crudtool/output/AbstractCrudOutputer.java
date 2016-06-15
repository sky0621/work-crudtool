package xyz.skycat.work.crudtool.output;

import xyz.skycat.work.crudtool.facade.type.CrudTypeEnum;

import java.util.stream.Stream;

/**
 * Created by SS on 2016/06/16.
 */
public abstract class AbstractCrudOutputer implements IfCrudOutputer {

    private String sqlFileName;

    private CrudTypeEnum crudType;

    private Stream strm;

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
