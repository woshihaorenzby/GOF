package com.singleton.full;

/**
 * 饱汉模式
 * 解决了饿汉模式线程不安全的问题，但是比较占用资源
 *
 */
public class Singleton_full {
    private static Singleton_full instance;
    private Singleton_full(){}
    static {
        instance = new Singleton_full();
    }
    public static Singleton_full getInstance(){
        return instance;
    }

}
