package com.example.demo.thread.threadLocal;

/**
 * @author huyd
 * @date 2019/4/4
 */
public class ThreadLocalRunAction {

    public static void main(String[] args) {

            ThreadA threadA = new ThreadA();
            ThreadB threadB = new ThreadB();
            ThreadC threadC = new ThreadC();

            threadA.start();
            threadB.run();
            threadC.run();

    }
}
