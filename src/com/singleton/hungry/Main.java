package com.singleton.hungry;

/**
 * 这个demo可以看出来饿汉模式是线程不安全的
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
            Singleton_hungry instance1 = Singleton_hungry.getInstance();
            System.out.println(instance1);
        }
    }
}
