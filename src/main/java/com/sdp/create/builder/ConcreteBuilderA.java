package com.sdp.create.builder;

public class ConcreteBuilderA extends Builder {
    public void builderParA() {
         product.setPartA("发动机A");
    }

    public void builderParB() {
        product.setPartB("方向盘A");
    }

    public void builderParC() {
        product.setPartC("轮胎A");
    }
}
