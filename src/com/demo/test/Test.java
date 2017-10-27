package com.demo.test;

import com.demo.thread.Model;
import java.math.BigDecimal;
import java.util.*;

/**
 * @author dfz
 * @version 1.0
 * @E-mail: dfz@jkinvest.cn
 * @date 创建时间： 11:12  2017/6/15
 * @return
 */
public class Test {


    @org.junit.Test
    public void test1(){
        System.out.println(new BigDecimal(0.355d));
        System.out.println(new BigDecimal("0.355").setScale(2,BigDecimal.ROUND_HALF_EVEN));
        System.out.println(new BigDecimal("0.356").setScale(2,BigDecimal.ROUND_HALF_EVEN));
//        System.out.println(new Random(1000).nextInt());
//        System.out.println(new Random(1000).nextInt());
        System.out.println(new Random().nextInt(1000000));
    }

    @org.junit.Test
    public void hehe() throws InterruptedException {
            System.out.println(new Random().nextInt(1000));
    }

    @org.junit.Test
    public void test2(){
        List<String> a = new ArrayList<>();
        a.add("1");
        a.add("2");
        Iterator<String> iter = a.iterator();
        while (iter.hasNext()) {
            String x = iter.next();
            if (x.equals("1")) {
                iter.remove();
            }
        }
        String[] arr=new String[a.size()];
    }

    public static void main(String[] args) {
        Comparator<Model> c=  new Comparator<Model>() {
            @Override
            public int compare(Model o1, Model o2) {
                return o2.getAge()-o1.getAge();
            }
        };
        List<Model> list=new ArrayList<>();
        for(int  i=0;i<5;i++){
            Model t=new Model();
            t.setName("jim"+i);
            t.setAge(i+new Random().nextInt(100));
            list.add(t);
        }
        Collections.sort(list,c);

        for (Model threadDemo : list) {
            System.out.println(threadDemo.getAge());
        }
    }
}
