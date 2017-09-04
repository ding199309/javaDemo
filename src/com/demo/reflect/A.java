package com.demo.reflect;

/**
 * @author dfz
 * @version 1.0
 * @E-mail: dfz@jkinvest.cn
 * @date 创建时间： 17:16  2017/6/5
 * @return
 */
public class A {

    public static void main(String[] args) {
        for(int i=0;i<81;i++){
            if(i%9<Math.abs(i/9-4)){
                System.out.print(" ");
            }else if(i%9<8-Math.abs(i/9-4)){
                System.out.print("*");

            }else if(i%9==8){
                System.out.println("*");
            }

        }
    }
}
