package com.demo.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

/** 
* @author   dfz
* 作者 E-mail:  dfz@jkinvest.cn
* @date 创建时间：2017年4月27日 下午3:02:59 
* @version 1.0 
* @parameter  
* @since  
* @return  
*/
public class TestTx {
	
	public static void test(){
		int sum=100;
		int sal=0;
		int price=50;
		
		Jedis jedis =new Jedis("192.168.109.128",6379);
	//	jedis.set("sum", "100");
	//	jedis.set("sal", "0");
		
		sum=Integer.parseInt(jedis.get("sum"));
		jedis.watch("sum");
		if(sum<price){
			jedis.unwatch();
			System.out.println("gggggg");
		}else{
			Transaction transaction=jedis.multi();
			transaction.incrBy("sal", price);
			transaction.decrBy("sum", price);
			transaction.exec();
			System.out.println("ok======");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		test();
	}
	
	

}
