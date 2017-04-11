/** 
 * Project Name:javaDemo 
 * File Name:TestEnum.java 
 * Package Name:com.demo.enumDemo 
 * Date:2017��4��10������4:21:18 
 * Copyright (c) 2017, chenzhou1025@126.com All Rights Reserved. 
 * 
*/  
  
package com.demo.enumDemo;  
/** 
 * ClassName:TestEnumDemoTwo<br/> 
 * Function: ����ö�� <br/> 
 * Date:     2017��4��10�� ����4:21:18 <br/> 
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
		//ö��������һ�����ͣ����ڶ�������������Ʊ����ĸ�ֵ����ֵʱͨ����ö����.ֵ����ȡ�����ö���е�ֵ
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
		  System.out.println("����ColorSelect�е�ֵ"); 
		  for (ColorSelect c:ColorSelect.values()) {
			System.out.print(c+" ");
		}
		System.out.println("ö��ColorSelect�е�ֵ��:"+ColorSelect.values().length+"��");
		/*ordinal()����ö��ֵ��ö���е�����λ�ã���0��ʼ*/ 
		System.out.println(ColorSelect.green.ordinal());
		 /*name()����ö��ֵ��ö���е�����λ�ã���0��ʼ*/  
		System.out.println(ColorSelect.green.name());
		/*ö��Ĭ��ʵ����java.lang.Comparable�ӿ�,-1֮ǰ��0λ����ͬ��1֮��*/   
		System.out.println(ColorSelect.yellow.compareTo(ColorSelect.green));
		/*��̬valueOf()��������������ָ�����ַ�������ת��Ϊö������*/  
		ColorSelect red=ColorSelect.valueOf("red");
		System.out.println(red.getClass());
		
	}
}
  