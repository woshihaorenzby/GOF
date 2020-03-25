package com.singleton.senum;

/**
 * 枚举法
 *
 * 最优解
 *
 *
 */
public enum Singleton_enum {
    INSTANCE;
    public void doSomething(){
        String name = Thread.currentThread().getName();
        System.out.println(name);
    }
}
