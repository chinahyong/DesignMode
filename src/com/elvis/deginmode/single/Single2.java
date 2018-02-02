package com.elvis.deginmode.single;

/**
 * @author elvis
 * 单例模式：懒汉
 * 当多线程时，会造成实例化多个实例，线程不安全
 */
public class Single2 {
    private static Single2 mInstance;

    private Single2() {

    }

    public static Single2 getInstance() {
        if (mInstance == null) {
            mInstance = new Single2();
        }
        return mInstance;
    }
}
