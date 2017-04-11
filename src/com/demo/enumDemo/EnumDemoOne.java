/** 
 * Project Name:javaDemo 
 * File Name:EnumDemoOne.java 
 * Package Name:com.demo.enumDemo 
 * Date:2017年4月10日下午4:19:03 
 * Copyright (c) 2017, chenzhou1025@126.com All Rights Reserved. 
 * 
*/  
  
package com.demo.enumDemo;  
/** 
 * ClassName:EnumDemoOne <br/> 
 * Function: 枚举demo. <br/> 
 * Date:     2017年4月10日 下午4:19:03 <br/> 
 * @author   dfz
 * @version   
 * @since    JDK 1.8 
 * @see       
 */
public class EnumDemoOne {
	
	private enum InnerEnum{
		RED,GREEN,YELLOW
	};
	public static void main(String[] args){
		System.out.println(InnerEnum.RED);
		System.out.println(InnerEnum.GREEN);
		System.out.println(InnerEnum.YELLOW);
	}

}
  