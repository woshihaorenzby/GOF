package com.singleton.hungry;

/**
 * 饿汉模式
 * 具有线程不安全的问题
 *
 */
public class Singleton_hungry {
    private static Singleton_hungry instance;
    private Singleton_hungry(){}
    public static Singleton_hungry getInstance(){
        if(instance==null){
            instance = new Singleton_hungry();
        }
        return instance;
    }

}
