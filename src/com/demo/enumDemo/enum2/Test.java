/** 
 * Project Name:javaDemo 
 * File Name:EnumTest.java 
 * Package Name:com.demo.enumDemo.enum2 
 * Date:2017年4月18日下午2:11:25 
 * Copyright (c) 2017, chenzhou1025@126.com All Rights Reserved. 
 * 
*/  
  
package com.demo.enumDemo.enum2;

import java.util.EnumMap;
import java.util.Map.Entry;

/** 
 * ClassName:EnumTest <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Date:     2017年4月18日 下午2:11:25 <br/> 
 * @author   dfz
 * @version   
 * @since    JDK 1.8 
 * @see       
 */

public class Test{
	public static void main(String[] args) {
		for (EnumTest e:EnumTest.values()) {
			System.out.println(e.ordinal()+"::=e.name="+e.name()+"::=e.name.getClass="+e.name().getClass()+"::=e="+e+"::=e.getClass="+e.getClass());
		}
		
		// EnumMap的使用
        EnumMap<EnumTest, String> weekMap = new EnumMap<EnumTest,String>(EnumTest.class);
        weekMap.put(EnumTest.MON, "星期一");
        weekMap.put(EnumTest.TUE, "星期二");
        
        for(Entry<EnumTest,String> map:weekMap.entrySet()){
        	System.out.println(map.getKey().getClass());
        }
	}	
}


enum EnumTest{
	MON("1"), TUE("2"), WED("3"), THU("4"), FRI("5"), SAT("6"), SUN("7");	
	private String  code;
	private EnumTest(){		
	}
	private EnumTest(String code){
		this.code=code;
	}	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}		
}
  