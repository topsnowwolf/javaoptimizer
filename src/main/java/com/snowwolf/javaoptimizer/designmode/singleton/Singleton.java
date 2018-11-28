package com.snowwolf.javaoptimizer.designmode.singleton;

/**
 * @author: topsnowwolf
 * @description:单例模式，最简单的创建方式。饿汉式
 * @date: Create in 2018/11/28 22:48
 * @modified by:
 * @versions：0.1.0
 */
public class Singleton {
    private Singleton(){
        System.out.println("Singleton is create");
    }
    //将singleton设置为静态属性并赋值。当类被加载就创建了这个对象。
    private static Singleton singleton = new Singleton();

    /**
     * 通过静态方法调用
     * @return
     */
    public static Singleton getSingleton(){
        return singleton;
    }
}
