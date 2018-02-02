package com.elvis.deginmode.builder;

/**
 * @author elvis
 * 具体的builder类
 */
public class ConcreateBuilder extends Builder {
    @Override
    Builder setPart1(int part1) {
        mEntity.part1 = part1;
        return this;
    }

    @Override
    Builder setPart2(int part2) {
        mEntity.part2 = part2;
        return this;
    }

    @Override
    Builder setPart3(int part3) {
        mEntity.part3 = part3;
        return this;
    }
}
