package com.demo.hashmap;

public interface MyMap<K,V> {
	
	//往map里面写值
	V put(K key,V value);
	//从map中取值
	V get(K key);
	//去重后的值
	int size();
	
	//entry
	interface Entry<K,V>{
		
		  K getKey();
		  V getValue();
	}

}
