package com.demo.methods;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/** 
* @author   dfz
* 作者 E-mail:  dfz@jkinvest.cn
* @date 创建时间：2017年4月20日 上午10:27:02 
* @version 1.0 
* @parameter  
* @since  
* @return  
*/
public class MethodsTest {
	
	public static void main(String[] args) {	 
		ConcurrentMap<String,Object>  map=new  ConcurrentHashMap<String,Object>();	 
		test(new String("1,2,3,4").split(","));		 
		test1(new int[]{1,2,3,4,5});
	}
	
	public static  void test(String ...time){
		for (int i = 0; i < time.length; i++) {
			System.out.print(time[i]+" ");
		}
	}
	public static  void test1(int ...time){
		System.out.println(1);
	}
	public static  void test1(Long ...time){
		System.out.println(2);
	}
	public static  void test1(Object ...time){
		System.out.println(3);
	}

}
