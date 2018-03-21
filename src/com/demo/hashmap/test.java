package com.demo.hashmap;

import java.util.HashMap;
import java.util.Map;

public class test {
	public static void main(String[] args) {
//		Map<String,String> map=new HashMap<String,String>();
		
		byte[] key="1".getBytes();
		MyMap<byte[],String>  map=new MyHashMap<byte[],String>();
		map.put(key, "jim");
		map.put(key, "tom");
		map.put(key, "haha");
		System.out.println(map.get(key));
				
		byte[] key1="1".getBytes();
		Map<byte[],String>  map2=new HashMap<byte[],String>();
		map2.put(key1, "jim");
		map2.put(key1, "tom");
		map2.put(key1, "haha");
		System.out.println(map2.get(key1));
		System.out.println(map2.get(null));	
	}
}
