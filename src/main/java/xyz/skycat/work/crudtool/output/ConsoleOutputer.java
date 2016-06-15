package xyz.skycat.work.crudtool.output;

/**
 * Created by SS on 2016/06/15.
 */
public class ConsoleOutputer extends AbstractCrudOutputer {

    @Override
    public void output() {
        System.out.print(String.format("%s\t", getSqlFileName()));
        getStreamData().forEachOrdered(tableName -> {
            System.out.print(String.format("%s(%s)\t", tableName, getCrudType().alias()));
        });
        System.out.print("\n");
    }

}
