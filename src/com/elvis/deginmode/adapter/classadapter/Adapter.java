package com.elvis.deginmode.adapter.classadapter;

/**
 * @author elvis
 * 类适配器，通过类继承将适配者类adape转为目标api Target
 */
public class Adapter extends Adapte implements Target {
    @Override
    public void operation2() {
        System.out.println("operation2");
    }
}
