package com.snowwolf.javaoptimizer.designmode.singleton;

/**
 * @author: topsnowwolf
 * @description: 通过内部类方式实现单例模式。 是三者中最完善的一种。
 * @date: Create in 2018/11/28 23:03
 * @modified by:
 * @versions：0.1.0
 */
public class InnerSingleton {
    private InnerSingleton(){
        System.out.println("InnerSingletion is create");
    }
    /**
     * 当InnerSingleton被加载时它对应的内部类不会被初始化，但InnerSingleton加载到了JVM内存中。
     * 当调用getInnerSingletion方法时，才加载内部类，从而初始化InnerSingleton对象
     */
    private static class SingletonHolder{
        private static InnerSingleton innerSingleton = new InnerSingleton();
    }

    public static InnerSingleton getInnerSingletion(){
        return SingletonHolder.innerSingleton;
    }
}
