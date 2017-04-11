/** 
 * Project Name:javaDemo 
 * File Name:TestEnumDemoThree.java 
 * Package Name:com.demo.enumDemo 
 * Date:2017年4月10日下午4:49:48 
 * Copyright (c) 2017, chenzhou1025@126.com All Rights Reserved. 
 * 
*/  
  
package com.demo.enumDemo;

import java.util.EnumMap;

/** 
 * ClassName:TestEnumDemoThree <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Date:     2017年4月10日 下午4:49:48 <br/> 
 * @author   dfz
 * @version   
 * @since    JDK 1.8 
 * @see       
 */
public class TestEnumDemoThree {
	// 1. 定义枚举类型  
    public enum Light {  
       /*利用构造函数传参利用构造函数传参 
       * 通过括号赋值,而且必须有带参构造器和属性和方法，否则编译出错  
       * 赋值必须是都赋值或都不赋值，不能一部分赋值一部分不赋值  
       * 如果不赋值则不能写构造器，赋值编译也出错 
       * */    
       RED ("红色"), GREEN ("绿色"), YELLOW ("黄色");     
       // 定义私有变量  
       private String clor ;    
       // 构造函数，枚举类型只能为私有  
       private Light(String clor) {  
           this.clor = clor;  
       }  
       private Light(){
    	   
       }
       public String getClor(){  
           return this.clor;  
       }           
       public void setClor(String clor){  
           this.clor=clor;  
       }          
       @Override  
       public String toString() {  
           return this.clor;  
       }  
    }   
    /**
     * 演示枚举类型的遍历
     */
    public static void  list(){
    	for (Light light:Light.values()) {
			System.out.println("当前灯的ordinal::"+light.ordinal()+"|"+"当前灯的name::"+light.name()+"|"+"当前灯::"+light);
		}
    }
    private static void testEnumMap(){
    	//1.演示定义 EnumMap对象,  EnumMap对象的构造函数需要参数传入，默认是Key的类的类型
    	EnumMap<Light,String> currentEnumMap=new EnumMap<Light,String>(Light.class);
    	currentEnumMap.put(Light.RED, "红灯");
    	currentEnumMap.put(Light.GREEN, "蓝灯");
    	currentEnumMap.put(Light.YELLOW,"黄灯");
    	
    	Light[] ls=Light.values();
    	for (int i=0;i<ls.length;i++) {
			System.out.println("key=="+ls[i].name()+",value="+currentEnumMap.get(ls[i]));
		}
    	
    	
    }
    
    
    public static void main(String[] args) {
		//1：遍历枚举类型
    	System.out.println("1.演示枚举类型的遍历=====");
    	list();
    	// 2. 演示 EnumMap 对象的使用 
    	 System. out .println( "2.演示 EnmuMap 对象的使用和遍历 ....." ); 
    	 testEnumMap();
	} 
}
  