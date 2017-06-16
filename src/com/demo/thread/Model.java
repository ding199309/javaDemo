package com.demo.thread;

/**
 * @author dfz
 * @version 1.0
 * @E-mail: dfz@jkinvest.cn
 * @date 创建时间： 13:53  2017/6/7
 * @return
 */
public class Model {


    public   String  name;
    public   int  age;

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
    public String toString() {
        return "ThreadDemo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
