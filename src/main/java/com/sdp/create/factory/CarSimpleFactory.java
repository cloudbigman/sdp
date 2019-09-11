package com.sdp.create.factory;

import java.util.ResourceBundle;

//简单工厂类
public class CarSimpleFactory {
    //静态方法
    //存在的问题：当有新的产品产生时，这个方法需要修改
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

    public static ICar create1(String carname) throws Exception{
        ResourceBundle bundle = ResourceBundle.getBundle("cars");
        String classLongName = bundle.getString(carname);
        //Java反射
        return (ICar)Class.forName(classLongName).newInstance();
    }

}
