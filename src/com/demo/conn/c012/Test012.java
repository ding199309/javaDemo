package com.demo.conn.c012;

/**
 *  volatile变量的使用
 *
 *
 *
 * Created with IntelliJ IDEA.
 * User: woting
 * Date: 2017/12/19
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Test012  implements Runnable{


   volatile   boolean   flag=true;

   @Override
    public void run() {
        System.out.println("m1    begin");
        while (flag){
//            try {
//                TimeUnit.SECONDS.sleep(2);
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }
        }
        System.out.println("m1    over");
    }

    public static void main(String[] args) {
            Test012 t=new Test012();

            new Thread(t).start();


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.flag=false;
        System.out.println("over");
    }



}
