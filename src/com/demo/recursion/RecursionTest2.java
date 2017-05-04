package com.demo.recursion;

import java.util.ArrayList;
import java.util.List;

/** 
* @author   dfz
* 作者 E-mail:  dfz@jkinvest.cn
* @date 创建时间：2017年5月4日 下午3:56:24 
* @version 1.0 
* @parameter  
* @since  
* @return  
*/
public class RecursionTest2 {
	
	static char[] chars="abc".toCharArray();
	
	public static void main(String[] args) {
		for(int i=0;i<chars.length;i++){
			List<Integer> list=new ArrayList<>();
			list.add(i);
			play(list);
		}
	}	
	public static void  play(List<Integer> list){
		pr(list);		
		for (int i = 0; i < chars.length; i++) {
			if(!list.contains(i)){
				List<Integer> list2=new ArrayList<>(list);
				list2.add(i);
				play(list2);
			}
		}
	}	
	public static void pr(List<Integer> list){
		for(Integer emp:list){
			System.out.print(chars[emp]+"");
		}
		System.out.println();
	}
}
