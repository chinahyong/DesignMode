package com.elvis.deginmode.builder;

/**
 * @author elvis
 * 抽象builder类，构建实体各个成员数据
 * 方法构建返回Builder本身是为了 实现现在比较流行的链式调用方式
 * new Builder()
 * .setPart1()
 * .setPart2()
 * .setPart3()
 * .build()
 * 如果不需要直接void就好了
 */
public abstract class Builder {
    protected Product mEntity;

    public Builder() {
        mEntity = new Product();
    }

    Builder setPart1(int part1) {
        return this;
    }

    Builder setPart2(int part2) {
        return this;
    }

    Builder setPart3(int part3) {
        return this;
    }

    Product build() {
        return mEntity;
    }
}
