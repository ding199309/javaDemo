package com.demo.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/** 
* @author   dfz
* 作者 E-mail:  dfz@jkinvest.cn
* @date 创建时间：2017年4月27日 下午3:21:45 
* @version 1.0 
* @parameter  
* @since  
* @return  
*/
public class JedisPoolUtil {
	
	private JedisPoolUtil(){}
	private static volatile JedisPool jedisPool=null;

	public static JedisPool getInstance(){
		if(null==jedisPool){
			synchronized(JedisPoolUtil.class){
				if(null==jedisPool){						
					JedisPoolConfig jedisPoolConfig=new JedisPoolConfig();
					//控制一个pool可分配多少个jedis实例，通过pool.getResource()来获取；如果赋值为-1，则表示不限制，
                    //如果pool已经分配了maxActive个jedis实例，则此时pool的状态为exhausted
					jedisPoolConfig.setMaxActive(1000);
					jedisPoolConfig.setMaxIdle(10);//设置剩余连接各数，如果小于这个就会抛异常
                    //表示当borrow一个jedis实例时，最大的等待时间，如果超过等待时间，则直接抛JedisConnectionException
					jedisPoolConfig.setMaxWait(1000*10);
					//获得一个jedis实例的时候是否检查连接可用性(ping()),如果为true，则得到的jedis实例均是可用的
					jedisPoolConfig.setTestOnBorrow(true);					
					jedisPool=new JedisPool(jedisPoolConfig, "192.168.109.128", 6379);
				}				
			}
		}		
		return jedisPool;
	}
	
	public static void release(JedisPool jedisPool,Jedis jedis){
		if(jedis!=null){
			jedisPool.returnResource(jedis);
		}
	}
}
