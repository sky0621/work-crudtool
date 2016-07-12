package xyz.skycat.work.crudtool;

import xyz.skycat.work.crudtool.config.ConfiguratiionManager;

/**
 * Created by SS on 2016/06/10.
 */
public class Main {

    public static void main(String... args) {
        try {
            new Executor().run(Argument.parse(args), ConfiguratiionManager.getConfiguration());
            System.exit(0);
        } catch (Throwable t) {
            System.exit(-1);
        }
    }

}
