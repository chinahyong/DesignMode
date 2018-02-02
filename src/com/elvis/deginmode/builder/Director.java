package com.elvis.deginmode.builder;

/**
 * @author elvis
 * 操作build类的Director操作类
 * 实际开发中一般是：entity + concreatebuild 直接实现，而绕过了 抽象build与director
 */
public class Director {
    private Builder mBuilder;

    private Director() {

    }

    public static final Director getInstance() {
        return DirectorHolder.director;
    }

    public Builder builder() {
        mBuilder = new ConcreateBuilder();
        return mBuilder;
    }

    // 调用build构建
    public void buildEntity() {
        mBuilder.build();
    }

    private static class DirectorHolder {
        private static final Director director = new Director();
    }
}
