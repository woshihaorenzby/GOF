package com.singleton.svolatile;

/**
 * 双重验证模式（volatile）
 *
 * volatile通过对重排的限制，解决了重读的问题，保证在写操作没有完成之前不能调用读操作。
 *
 *
 */
public class Singleton_doubleCheck {
    private static volatile Singleton_doubleCheck instance;
    private Singleton_doubleCheck(){}
    public static Singleton_doubleCheck getInstance(){
        if(instance==null){//代码级别，第一次每个线程都可以进来
            synchronized (Singleton_doubleCheck.class){
                if(instance==null){//第二重判断，只有一个线程可以进来，其他线程会monitor
                    instance = new Singleton_doubleCheck();
                }
            }
        }
        return instance;
    }

}
