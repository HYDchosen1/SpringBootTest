package com.example.demo.thread.threadLocal;

/**
 * @author huyd
 * @date 2019/4/4
 */
public class ThreadA extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {

                System.out.println("thread A get :" + ThreadTool.threadLocal.get());

                ThreadTool.threadLocal.set("thread A set:" +i);
                Thread.sleep(200);
            }
        }catch (Exception e){

        }
    }
}
