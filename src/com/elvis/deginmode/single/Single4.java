package com.elvis.deginmode.single;

/**
 * @author elvis
 * 单例模式：DCL 双层检查机制
 * 当JVM 编译器 指令重排序时
 */
public class Single4 {
    // volatile 可以解决 指令重排序的 缺点
    private static volatile Single4 mInstance;

    private Single4() {

    }

    public static Single4 getInstance() {
        if (mInstance == null) {
            synchronized (Single4.class) {
                if (mInstance == null) {
                    mInstance = new Single4();
                }
            }
        }
        return mInstance;
    }
}
