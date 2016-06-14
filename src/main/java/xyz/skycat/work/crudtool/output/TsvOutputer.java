package xyz.skycat.work.crudtool.output;

import xyz.skycat.work.crudtool.facade.type.CrudTypeEnum;

import java.util.stream.Stream;

/**
 * Created by SS on 2016/06/15.
 */
public class TsvOutputer implements IfCrudOutputer {

    @Override
    public void output() {

    }

    @Override
    public void setSqlFileName(String sqlFileName) {

    }

    @Override
    public String getSqlFileName() {
        return null;
    }

    @Override
    public void setCrudType(CrudTypeEnum crudType) {

    }

    @Override
    public CrudTypeEnum getCrudType() {
        return null;
    }

    @Override
    public void setStreamData(Stream strm) {

    }

    @Override
    public Stream getStreamData() {
        return null;
    }

}
