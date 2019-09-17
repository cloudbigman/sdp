package com.sdp.create.builder;

import java.lang.reflect.Constructor;
import java.security.KeyStore;
import java.util.Properties;
import java.util.ResourceBundle;

public class BuilderFactory {
    public static Builder createBuilder(String name) throws Exception{
        //加载classpath路径下的baseName.properties文件
        ResourceBundle bundle = ResourceBundle.getBundle("builder");
        String className = bundle.getString(name);
        //利用Java的反射创建className的对象
        Class clazz =  Class.forName(className);
        //获得构造器对象
        Constructor constructor = clazz.getConstructor();
        return (Builder)constructor.newInstance();
    }
}
