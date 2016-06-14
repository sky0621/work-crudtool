package xyz.skycat.work.crudtool.output;

import xyz.skycat.work.crudtool.facade.type.CrudTypeEnum;

import java.util.stream.Stream;

/**
 * Created by SS on 2016/06/14.
 */
public interface IfCrudOutputer {

    public void output();

    void setSqlFileName(String sqlFileName);

    String getSqlFileName();

    void setCrudType(CrudTypeEnum crudType);

    CrudTypeEnum getCrudType();

    void setStreamData(Stream strm);

    Stream getStreamData();

}
