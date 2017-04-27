package com.demo.tostringandhash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

/** 
* @author   dfz
* 作者 E-mail:  dfz@jkinvest.cn
* @date 创建时间：2017年4月24日 下午4:47:34 
* @version 1.0 
* @parameter  
* @since  
* @return  
*/
public class Test {
	
	private static final int HashSet = 0;
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Test(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	@Override
	public int hashCode() {
		 System.out.println(this.name+"：先调用hashCode,想用什么方式比较自己写,若想同，再调用equals");
		return age;
	}
	@Override
	public boolean equals(Object obj) {
		 System.out.println(this.name+":调用equals，想用什么方式比较自己写");
		if(null==obj){
			return false;
		}
		if(obj instanceof Test){
			Test test=(Test) obj;
			return this.age==test.age?true:false;
		}		
		return false;
	}
	
	public static void main(String[] args) {
		Test test1=new Test("a",1);
		Test test2=new Test("b",1);
		Test test3=new Test("c",2);
		Test test4=new Test("d",4);		
		
		HashSet<Test> testa = new HashSet<Test>();
		testa.add(test1);
		testa.add(test2);
		testa.add(test3);
		testa.add(test4);
		for(Test test:testa){
			System.err.println(test.name+"=="+test.age);
		}
		System.out.println("-----------------------------");
		Map<Test,Test> map=new HashMap<Test,Test>();
		map.put(test1, test1);
		map.put(test2, test2);
		map.put(test3, test3);
		map.put(test4, test4);
		
		System.out.println(map.size());
		for(Entry<Test,Test> test:map.entrySet()){
			System.out.println(test.getKey().name+"----"+test.getValue().age);
		}
	}
	

}
