package com.demo;

import java.io.File;
import java.io.FileFilter;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author dfz
 * E-mail:  dfz@jkinvest.cn
 * @version 1.0
 * @date 创建时间：2017/11/6 10:45
 * @parameter
 * @return
 */
public class Test {


    private static final String PAHT="E:\\学习";
    private static AtomicInteger SUM=new AtomicInteger(0);

    public  static void    test(String path){
        File file=new File(path);
        if(file.isDirectory()){
                File[] files=file.listFiles();
                if(files!=null&&files.length>0){
                    for (File file1:files) {
                        if(file1.isDirectory()){
                            test(file1.getAbsolutePath());
                        }else{
                            SUM.addAndGet(1);
                            System.out.println(file1.getAbsolutePath());
                        }
                    }
                }
        }else if(file.isFile()){
            SUM.addAndGet(1);
            System.out.println(file.getAbsolutePath());
        }else{
            System.out.println("可以了");
        }
    }
    public static void main(String[] args) {
        test(PAHT);
        System.out.println(SUM.get());
    }
}
