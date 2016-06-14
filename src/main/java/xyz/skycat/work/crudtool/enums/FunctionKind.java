package xyz.skycat.work.crudtool.enums;

/**
 * Created by SS on 2016/06/15.
 */
public enum FunctionKind {

    TABLE_NAMES_FIND("TableNamesFind");

    private String name;

    FunctionKind(String name) {

        this.name = name;
    }

    public String n() {

        return this.name;
    }

}
