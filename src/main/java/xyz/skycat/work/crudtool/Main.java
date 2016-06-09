package xyz.skycat.work.crudtool;

/**
 * Created by SS on 2016/06/10.
 */
public class Main {

    public static void main(String... args) {
        try {
            new Executor().run(Argument.parse(args));
            System.exit(0);
        } catch (Throwable t) {
            System.exit(-1);
        }
    }

}
