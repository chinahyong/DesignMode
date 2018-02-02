package com.elvis.deginmode.single;

/**
 * @author elvis
 * 单例模式：饿汉
 * 无法实现懒加载（当用户未使用该类时，也会进行类的创建）
 */
public class Single {
    private static Single mInstance = new Single();

    private Single() {

    }

    public static Single getInstance() {
        return mInstance;
    }
}
