package com.elvis.deginmode.single;

/**
 * @author elvis
 * 单例模式：内部类
 * 静态内部类的唯一性 已经 final的线程安全性；  推荐使用
 */
public class Single5 {

    private Single5() {

    }

    public static Single5 getInstance() {
        return SingleHolder.single;
    }

    private static class SingleHolder {
        private static final Single5 single = new Single5();
    }
}
