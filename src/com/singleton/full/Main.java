package com.singleton.full;

/**
 * 饱汉模式
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
            Singleton_full instance1 = Singleton_full.getInstance();
            System.out.println(instance1);
        }
    }
}
