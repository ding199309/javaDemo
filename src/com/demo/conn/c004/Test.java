package com.demo.conn.c004;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author dfz
 * @email dfz@jkinvest.cn
 * @create 2017-12-06 10:30
 * @see [相关类/方法]（可选）
 * @since 1.0
 * @deprecated （可选）
 */
public class Test{

    private static  int count=10;

    public synchronized  static  void  test1() throws InterruptedException {
//        Thread.sleep(5000);
        count--;
        System.out.println(Thread.currentThread().getName()+" count=1="+count);
    }
    public synchronized  static  void  test2() throws InterruptedException {
//        Thread.sleep(5000);
        count--;
        System.out.println(Thread.currentThread().getName()+" count=2="+count);
    }
    public  static   void  test3(){
            synchronized (Test.class){
            System.out.println("=3="+count--);
        }
    }

   static class  A implements  Runnable{
          private  Test test;

        public A(Test test){
            this.test=test;
        }

        @Override
        public void run() {
            try {
                test.test1();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    static  class  B implements  Runnable{
          private  Test test;

        public B(Test test){
            this.test=test;
        }

        @Override
        public void run() {
            try {
                test2();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
//        Test test=new Test();//A线程正在执行一个对象中的同步方法，B线程是否可以同时执行同一个对象中的非同步方法？  可以
//        Thread thread1=new Thread(new A(test));
//        Thread thread2=new Thread(new B(test));
//        thread1.start();
//        thread2.start();
        //同上，B线程是否可以同时执行同一个对象中的另一个同步方法？
//        Test test=new Test();
//        Thread thread1=new Thread(new A(test));
//        Thread thread2=new Thread(new B(test));
//        thread1.start();
//        thread2.start();

    }


}
