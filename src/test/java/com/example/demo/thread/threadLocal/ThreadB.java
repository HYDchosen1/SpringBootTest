package com.example.demo.thread.threadLocal;

/**
 * @author huyd
 * @date 2019/4/4
 */
public class ThreadB implements Runnable{

    @Override
    public void run() {
        try {
            for (int i = 5; i < 10; i++) {

              System.out.println("thread B get :" + ThreadTool.threadLocal.get());
              ThreadTool.threadLocal.set("thread B set:" +i);

              Thread.sleep(200);
            }
        }catch (Exception e){

        }

    }
}
