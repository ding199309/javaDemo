package com.demo.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/** 
* @author   dfz
* 作者 E-mail:  dfz@jkinvest.cn
* @date 创建时间：2017年4月27日 下午3:21:26 
* @version 1.0 
* @parameter  
* @since  
* @return  
*/
public class TestPool {
	
	public static void main(String[] args) {
		JedisPool jedisPool  =JedisPoolUtil.getInstance();		
		Jedis jedis=jedisPool.getResource();		
		jedis.set("hehhe", "hahha");		
		JedisPoolUtil.release(jedisPool, jedis);
	}

}
