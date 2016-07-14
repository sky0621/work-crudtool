package xyz.skycat.work.crudtool.facade.type;

/**
 * Created by SS on 2016/06/01.
 */
public enum CrudTypeEnum {

    SELECT("参照", "R"),
    INSERT("登録", "C"),
    UPDATE("更新", "U"),
    DELETE("削除", "D"),
    NONE("CRUD無し", "-"),
    ERROR("解析失敗", "ERROR");

    private String jname;

    private String alias;

    CrudTypeEnum(String jname, String alias) {
        this.jname = jname;
        this.alias = alias;
    }

    public String jname() {
        return jname;
    }

    public String alias() {
        return alias;
    }

}
