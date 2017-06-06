package com.demo.reflect;

/**
 * @author dfz
 * @E-mail:  dfz@jkinvest.cn
 * @version 1.0
 * @date 创建时间： 11:44  2017/5/27
 * @return
 */





public class Demo {


    public   String name;
    public   int  age;

    private  String  text;


    public Demo(String name){
        this.name=name;
    }
    public Demo(int age){
        this.age=age;
    }
    public Demo(){
        this.name="default";
        this.age=0;
    }
    private Demo(String name,int age,String text){
        this.age=age;
        this.name=name;
        this.text=text;
    }


    private int add(int a, int b) {
        return a + b;
    }
    public int add2(int a, int b) {
        return a + b;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", text='" + text + '\'' +
                '}';
    }
}
