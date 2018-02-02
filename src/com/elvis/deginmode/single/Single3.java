package com.elvis.deginmode.single;

/**
 * @author elvis
 * 单例模式：懒汉线程安全
 * synchronized 导致性能缺陷，通过阻塞线程实现单独创建
 */
public class Single3 {
    private static Single3 mInstance;

    private Single3() {

    }

    public static Single3 getInstance() {
        synchronized (Single3.class) {
            if (mInstance == null) {
                mInstance = new Single3();
            }
        }
        return mInstance;
    }
}
