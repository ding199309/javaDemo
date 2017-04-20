package com.demo.recursion;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import com.alipay.api.internal.util.StringUtils;

/** 
* @author   dfz
* 作者 E-mail:  dfz@jkinvest.cn
* @date 创建时间：2017年4月20日 上午10:49:08 
* @version 1.0 
* @parameter  
* @since  
* @return  
*/
public class B {
	
	static int[] arr=new int[]{100,552,57,1,-1,0,4,9};
	
	public static void main(String[] args) {		
		System.out.println(compareMin(arr));			
		ConcurrentMap<String,Integer> map=some("good good study day day up");
		for( String m:map.keySet()){
			System.out.println("key==="+m+",value==="+map.get(m));
		}
	}			
	public static int compareMin(int[] arr){		
		int min=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<=arr[min]){
				min=i;
			}
		}		
		return arr[min];
	}		
	public static ConcurrentMap<String,Integer> some(String msg){		
		ConcurrentMap<String,Integer> map=new ConcurrentHashMap<>();
		String[] arr=msg.split("");
		for(String a:arr){
			if(!StringUtils.isEmpty(a)){
				if(map.containsKey(a)){
					map.put(a,map.get(a)+1);
				}else{
					map.put(a,1);
				}
			}
		}		
		return map;
	}
}
