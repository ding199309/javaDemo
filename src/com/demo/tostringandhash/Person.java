package com.demo.tostringandhash;

import java.util.HashSet;

/** 
* @author   dfz
* ���� E-mail:  dfz@jkinvest.cn
* @date ����ʱ�䣺2017��4��24�� ����5:02:48 
* @version 1.0 
* @parameter  
* @since  
* @return  
*/
public class Person {
    int age;
    String name;
     
    public Person(){}
    public Person(String name,int age){
        this.age = age;
        this.name=name;
    }
     
    @Override
    public boolean equals(Object obj) {
        System.out.println(this.name+":����equals������ʲô��ʽ�Ƚ��Լ�д");
        Person p = (Person)obj;
        return this.age==p.age?true:false;
    }
    @Override
    public int hashCode() {
        System.out.println(this.name+"���ȵ���hashCode,����ʲô��ʽ�Ƚ��Լ�д,����ͬ���ٵ���equals");
        return age;
    }
 
    public static void main(String[] args) {
        HashSet<Person> persons = new HashSet<Person>();
        Person p1=new Person("a",1);
        Person p2=new Person("b",1);
        Person p3=new Person("c",2);
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        for(Person p:persons){
            System.out.println(p.age);
        }
    }
 
}