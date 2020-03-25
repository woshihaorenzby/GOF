package com.singleton.staticClass;

/**
 * 双重验证模式
 */
public class Main {

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            new ExtendsThread().start();
        }
    }

    static class ExtendsThread extends Thread{
        @Override
        public void run() {
            Singleton_staticClass instance1 = Singleton_staticClass.getInstance();
            System.out.println(instance1);
        }
    }
}
