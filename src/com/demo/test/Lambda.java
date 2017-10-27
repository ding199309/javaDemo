package com.demo.test;

import java.io.File;
import java.math.BigDecimal;

/**
 * @author dfz
 * E-mail:  dfz@jkinvest.cn
 * @version 1.0
 * @date 创建时间：2017/9/18 15:53
 * @parameter
 * @return
 */
public class Lambda {
    public static void main(String[] args) {
        //测试lambda表达式
        File[] files=new File("D:\\").listFiles(File::isHidden);
        for (File file :files){
            System.out.println(file.getName());
        }
    }

}
