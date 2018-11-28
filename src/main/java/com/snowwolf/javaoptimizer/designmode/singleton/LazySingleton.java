package com.snowwolf.javaoptimizer.designmode.singleton;

/**
 * @author: topsnowwolf
 * @description:单例模式-懒汉式。当需要才创建。类加载时不进行创建。但是性能相对差！
 * @date: Create in 2018/11/28 22:55
 * @modified by:
 * @versions：0.1.0
 */
public class LazySingleton {
    private LazySingleton(){
        System.out.println("LazySingletion is create");
    }
    //将lazySingleton设置为静态属性但没有赋值。当类被加载时不进行创建。
    private static LazySingleton lazySingleton = null;
    public static synchronized LazySingleton getLazySingleton(){
        if (lazySingleton==null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
