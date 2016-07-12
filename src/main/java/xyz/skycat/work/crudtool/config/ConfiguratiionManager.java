package xyz.skycat.work.crudtool.config;

/**
 * Created by SS on 2016/07/13.
 */
public class ConfiguratiionManager {

    public static IfConfiguration getConfiguration() {

        // TODO depends on Config file [f.e. YAML]

        return new DefaultConfiguration();
    }

}
