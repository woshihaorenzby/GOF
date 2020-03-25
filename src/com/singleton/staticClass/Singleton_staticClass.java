package com.singleton.staticClass;

/**
 * 静态内部类
 *
 *利用静态类在堆中只能被实例化一次的特性，处理单例问题,而且在没有调用 getInstance() 方法之前，静态内部类不会进行初始化，在第一次调用该方法后就生成了唯一一个实例。
 *
 *
 */
public class Singleton_staticClass {
    private Singleton_staticClass(){}

    static class Singleton_staticClassHolder{
        public static Singleton_staticClass instance = new Singleton_staticClass();
    }
    public static Singleton_staticClass getInstance(){
        return Singleton_staticClassHolder.instance;
    }
}
