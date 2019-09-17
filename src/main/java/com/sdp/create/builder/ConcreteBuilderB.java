package com.sdp.create.builder;

public class ConcreteBuilderB extends Builder {
    public void builderParA() {
         product.setPartA("发动机B");
    }

    public void builderParB() {
        product.setPartB("方向盘B");
    }

    public void builderParC() {
        product.setPartC("轮胎B");
    }
}
