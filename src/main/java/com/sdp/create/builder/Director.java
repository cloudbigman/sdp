package com.sdp.create.builder;
public class Director {
    //持有抽象的构建者的引用
    private Builder builder;
    //构造注入：通过构造方法
    public Director(Builder builder) {
        this.builder = builder;
    }
    //设值注入：通过set方法
    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
    //部件的生产和装配过程
    public Product construct(){
        //指定装配工序（产品的生产过程）
        builder.builderParA();
        builder.builderParC();
        builder.builderParB();
        return builder.getResult();
    }
}
