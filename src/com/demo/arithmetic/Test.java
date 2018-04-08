package com.demo.arithmetic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author dfz
 * @email dfz@jkinvest.cn
 * @create 2018-03-22 16:14
 * @since 1.0
 */
public class Test {


    static  String  a=" hleol";

    public static void main(String[] args) {
        String [] arr=a.split("");
        List<String>  list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
    }

}
