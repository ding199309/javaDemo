/** 
 * Project Name:javaDemo 
 * File Name:TestEnumDemoThree.java 
 * Package Name:com.demo.enumDemo 
 * Date:2017��4��10������4:49:48 
 * Copyright (c) 2017, chenzhou1025@126.com All Rights Reserved. 
 * 
*/  
  
package com.demo.enumDemo;

import java.util.EnumMap;

/** 
 * ClassName:TestEnumDemoThree <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Date:     2017��4��10�� ����4:49:48 <br/> 
 * @author   dfz
 * @version   
 * @since    JDK 1.8 
 * @see       
 */
public class TestEnumDemoThree {
	// 1. ����ö������  
    public enum Light {  
       /*���ù��캯���������ù��캯������ 
       * ͨ�����Ÿ�ֵ,���ұ����д��ι����������Ժͷ���������������  
       * ��ֵ�����Ƕ���ֵ�򶼲���ֵ������һ���ָ�ֵһ���ֲ���ֵ  
       * �������ֵ����д����������ֵ����Ҳ���� 
       * */    
       RED ("��ɫ"), GREEN ("��ɫ"), YELLOW ("��ɫ");     
       // ����˽�б���  
       private String clor ;    
       // ���캯����ö������ֻ��Ϊ˽��  
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
     * ��ʾö�����͵ı���
     */
    public static void  list(){
    	for (Light light:Light.values()) {
			System.out.println("��ǰ�Ƶ�ordinal::"+light.ordinal()+"|"+"��ǰ�Ƶ�name::"+light.name()+"|"+"��ǰ��::"+light);
		}
    }
    private static void testEnumMap(){
    	//1.��ʾ���� EnumMap����,  EnumMap����Ĺ��캯����Ҫ�������룬Ĭ����Key���������
    	EnumMap<Light,String> currentEnumMap=new EnumMap<Light,String>(Light.class);
    	currentEnumMap.put(Light.RED, "���");
    	currentEnumMap.put(Light.GREEN, "����");
    	currentEnumMap.put(Light.YELLOW,"�Ƶ�");
    	
    	Light[] ls=Light.values();
    	for (int i=0;i<ls.length;i++) {
			System.out.println("key=="+ls[i].name()+",value="+currentEnumMap.get(ls[i]));
		}
    	
    	
    }
    
    
    public static void main(String[] args) {
		//1������ö������
    	System.out.println("1.��ʾö�����͵ı���=====");
    	list();
    	// 2. ��ʾ EnumMap �����ʹ�� 
    	 System. out .println( "2.��ʾ EnmuMap �����ʹ�úͱ��� ....." ); 
    	 testEnumMap();
	} 
}
  