package com.demo.hashmap;

public interface MyMap<K,V> {
	
	//��map����дֵ
	V put(K key,V value);
	//��map��ȡֵ
	V get(K key);
	//ȥ�غ��ֵ
	int size();
	
	//entry
	interface Entry<K,V>{
		
		  K getKey();
		  V getValue();
	}

}
