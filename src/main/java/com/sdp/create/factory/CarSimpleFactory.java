package com.sdp.create.factory;
//简单工厂类
public class CarSimpleFactory {
    //静态方法
    //不满足OCP
    public static ICar create(String carname){
        if("UpCar".equalsIgnoreCase(carname)){
            return new UpCar();
        }else if("MidCar".equalsIgnoreCase(carname)){
            return new MidCar();
        }else if("LowCar".equalsIgnoreCase(carname)){
            return new LowCar();
        }else if("SuperCar".equalsIgnoreCase(carname)){
            return new SuperCar();
        }else{
            return null;
        }
    }
}
