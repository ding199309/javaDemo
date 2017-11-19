package com.demo.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author dfz
 * E-mail:  dfz@jkinvest.cn
 * @version 1.0
 * @date 创建时间：2017/11/9 15:41
 * @parameter
 * @return
 */
public class CallableTest implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "test callable";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableTest callableTest=new CallableTest();
        FutureTask<String> futureTask=new FutureTask<String>(callableTest);

        new Thread(futureTask).start();

        System.out.println(futureTask.get());
    }

}
