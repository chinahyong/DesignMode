package com.elvis.deginmode.adapter.objectadapter;

/**
 * @author elvis
 * 对象适配器，通过将adapte委派来进行转换
 */
public class Adapter implements Target {
    public Adapte adapte;

    public Adapter(Adapte adapte) {
        this.adapte = adapte;
    }

    @Override
    public void operation1() {

    }

    @Override
    public void operation2() {
        System.out.println("operation2");
    }
}
