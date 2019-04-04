package com.example.demo.thread.threadLocal;

/**
 * @author huyd
 * @date 2019/4/4
 */
public class ThreadC implements Runnable{


    @Override
    public void run() {
        try {
            for (int i = 10; i < 15; i++) {

                System.out.println("thread C get :" + ThreadTool.dateThreadLocal.get());
                Thread.sleep(200);
            }
        }catch (Exception e){

        }
    }
}
