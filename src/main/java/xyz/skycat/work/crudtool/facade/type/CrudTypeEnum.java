package xyz.skycat.work.crudtool.facade.type;

/**
 * Created by SS on 2016/06/01.
 */
public enum CrudTypeEnum {

    SELECT("����", "R"),
    INSERT("�o�^", "C"),
    UPDATE("�X�V", "U"),
    DELETE("�폜", "D");

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
