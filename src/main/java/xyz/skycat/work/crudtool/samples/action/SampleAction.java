package xyz.skycat.work.crudtool.samples.action;

import xyz.skycat.work.crudtool.samples.service.SampleService;

/**
 * Created by SS on 2016/06/28.
 */
public class SampleAction {

    protected SampleService svc;

    public void act() {
        svc.select();
    }
}
