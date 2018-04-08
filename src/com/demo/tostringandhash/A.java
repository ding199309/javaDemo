package com.demo.tostringandhash;

/**
 * Created with IntelliJ IDEA.
 * User: woting
 * Date: 2018/3/26
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class A {

    private  volatile int a=0;


    public static   void  test1(String s){
        s.replace('j','1');
    }
    public static  void  test2(StringBuffer stringBuffer){
        stringBuffer.append("c");
    }

    public static void main(String[] args) {
        String s=new String("java");
        test1(s);
        StringBuffer stringBuffer=new StringBuffer("java");
        test2(stringBuffer);

        System.out.println(s+stringBuffer);
    }
}
