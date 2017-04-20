package com.demo.recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** 
* @author   dfz
* 作者 E-mail:  dfz@jkinvest.cn
* @date 创建时间：2017年4月20日 上午10:26:20 
* @version 1.0         重写comparTo的方法
* @parameter  
* @since  
* @return  
*/
public class A implements Comparable<A> {
	private String name;
    private int age;

    public A() {
    }
    public A(String name, int age) {
        this.name = name;
        this.age = age;
    }
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
	@Override
	public int compareTo(A o) {
			
		if(this.age>o.getAge()){
			return this.age-o.getAge();
		}
		if (this.age < o.getAge()) {
            return (this.age - o.getAge());
        }
		// 按name排序
        if (this.name.compareTo(o.getName()) > 0) {
            return 1;
        }
        if (this.name.compareTo(o.getName()) < 0) {
            return -1;
        }
        
		return 0;
	}
		
	public static void main(String[] args) {
		 	A f1 = new A("bony", 18);
	        A f2 = new A("aack", 11);
	        A f3 = new A("coma", 111);
	        A f4 = new A("dason", 44);

	        List<A> list = new ArrayList<A>();
	        list.add(f1);
	        list.add(f2);
	        list.add(f3);
	        list.add(f4);
	        Collections.sort(list);
	        for (A o : list) {
	            System.out.println(o.getAge() + "-->" + o.getName());
	        }
	        
	}
}
