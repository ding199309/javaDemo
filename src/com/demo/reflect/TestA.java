package com.demo.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author dfz
 * @version 1.0
 * @E-mail: dfz@jkinvest.cn
 * @date 创建时间： 13:53  2017/5/27
 * @return
 */

public class TestA {

    private  static  final Class t3= com.demo.reflect.Demo.class;


    // 1,反射机制获取类有三种方法，我们来获取Demo类型
    public static void demo1() throws ClassNotFoundException {
        //第一种方式：
        Class  t1=Class.forName("com.demo.reflect.Demo");
        System.out.println(t1);

        //第二种方式：
        //java中每个类型都有class 属性.
        Class t2=Demo.class;
        System.out.println(t2);

        //第三种方式：
        //java语言中任何一个java对象都有getClass 方法
        Demo demo2=new Demo();
        Class t3=demo2.getClass();
    }

    //2，创建对象：获取类以后我们来创建它的对象，利用newInstance：
    @Test
    public void demo2() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class t3= com.demo.reflect.Demo.class;
        Object o=t3.newInstance();
        System.out.println(o.getClass());

        Constructor c=t3.getConstructor(String.class);
        Demo  obj= (Demo) c.newInstance("jim");
        System.out.println(obj.getName());

    }

    //3,方法
    @Test
    public   void demo3() throws NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {

        System.out.println("获取public修饰的方法");
        Method[] me=t3.getMethods();
        for (Method method : me) {
            System.out.println(method.getName());
        }
        System.out.println("获取所有修饰符修饰的方法");
        //返回class对象所对应的类或接口中，所声明的所有方法的数组（包括私有方法）
        Method[] methods = t3.getDeclaredMethods();
        //遍历输出所有方法声明
        for(Method method : methods){
            System.out.println(method.getName());
        }
        Demo demo= (Demo) t3.newInstance();
        Method method=t3.getDeclaredMethod("add",int.class,int.class);
        method.setAccessible(true);
        int ssm= (int) method.invoke(demo,1,2);
        System.out.println("ssm=private修饰符==通过注入获取返回结果======1==="+ssm);
        com.demo.reflect.Demo demo1= (com.demo.reflect.Demo) t3.newInstance();
        Method method1=t3.getMethod("add2",int.class,int.class);
        int ssm1= (int) method.invoke(demo,1,11);
        System.out.println("ssm1=public修饰符==通过注入获取返回结果======2==="+ssm1);
    }

    @Test
    //4,属性
    public  void demo4() throws Exception{
        System.out.println("获取public修饰的属性:");
        Field[] fields=t3.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        System.out.println("获取所有修饰参数修饰的属性:");
        Field[] fie=t3.getDeclaredFields();
        for (Field field : fie) {
            System.out.println(field.getName());
        }

        com.demo.reflect.Demo demo= (com.demo.reflect.Demo) t3.newInstance();
        Field field=t3.getField("name");
        field.set(demo,"jim");
        System.out.println("======通过反射设置name值========"+demo.getName());

    }
    @Test
    //5  获取类的构造
    public  void demo5() throws  Exception{
        System.out.println("获取仅public修饰的构造========");
        Constructor[] constructors=t3.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("获取所有控制符修饰的构造=======");
        Constructor[] constructors1=t3.getDeclaredConstructors();
        for (Constructor constructor : constructors1) {
                System.out.println(constructor);

        }
    }
}
