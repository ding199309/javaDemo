/** 
 * Project Name:javaDemo 
 * File Name:TestEnum.java 
 * Package Name:com.demo.enumDemo 
 * Date:2017年4月10日下午4:21:18 
 * Copyright (c) 2017, chenzhou1025@126.com All Rights Reserved. 
 * 
*/  
  
package com.demo.enumDemo;  
/** 
 * ClassName:TestEnumDemoTwo<br/> 
 * Function: 测试枚举 <br/> 
 * Date:     2017年4月10日 下午4:21:18 <br/> 
 * @author   dfz
 * @version   
 * @since    JDK 1.8 
 * @see       
 */
public class TestEnumDemoTwo{
	
	public enum ColorSelect{
		red,green,yellow,blue
	};
	
	
	public static void main(String[] args) {
		//枚举类型是一种类型，用于定义变量，以限制变量的赋值，赋值时通过“枚举名.值”来取得相关枚举中的值
		ColorSelect m=ColorSelect.blue;
		switch (m) {
		case red:	
			  System.out.println("color is red");  
			break;
		 case green:  
             System.out.println("color is green");  
             break;  
         case yellow:  
             System.out.println("color is yellow");  
             break;  
         case blue:  
             System.out.println("color is blue");  
             break;
         default:
        	 System.out.println("-----");
        	 break;
		}
		  System.out.println("遍历ColorSelect中的值"); 
		  for (ColorSelect c:ColorSelect.values()) {
			System.out.print(c+" ");
		}
		System.out.println("枚举ColorSelect中的值有:"+ColorSelect.values().length+"个");
		/*ordinal()返回枚举值在枚举中的索引位置，从0开始*/ 
		System.out.println(ColorSelect.green.ordinal());
		 /*name()返回枚举值在枚举中的索引位置，从0开始*/  
		System.out.println(ColorSelect.green.name());
		/*枚举默认实现了java.lang.Comparable接口,-1之前，0位置相同，1之后*/   
		System.out.println(ColorSelect.yellow.compareTo(ColorSelect.green));
		/*静态valueOf()方法可以让您将指定的字符串尝试转换为枚举类型*/  
		ColorSelect red=ColorSelect.valueOf("red");
		System.out.println(red.getClass());
		
	}
}
  