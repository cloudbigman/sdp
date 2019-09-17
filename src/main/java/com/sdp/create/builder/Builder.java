package com.sdp.create.builder;
//抽象建造者
public abstract  class Builder {
    //出口：产品
    private Product product = new Product();
    //构建出产品的各个部件
    public abstract void builderParA();
    public abstract void builderParB();
    public abstract void builderParC();
    //返回创建后的产品对象
    public Product getResult(){
        return product;
    }
}
