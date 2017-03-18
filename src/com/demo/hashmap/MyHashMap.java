package com.demo.hashmap;

public class MyHashMap<K,V>  implements MyMap<K, V>{
	
	//�����ʼ����
	static final int DEFAULT_INITAL_CAPACITY=16;
	//�������
	static final int MAX_CAPACITY=Integer.MAX_VALUE;
	//��������
	static final float DEFAULT_LOAD_FACTOR=0.75f;
	//���������ݵ�����
	private Entry<K,V>[] table;
	
	private int initialCapacity;
	private float loadFactor;
	private int size;
	
	public MyHashMap(){
		this(DEFAULT_INITAL_CAPACITY,DEFAULT_LOAD_FACTOR);
	}
	public MyHashMap(int initialCapacity,float loadFactor){
		this.initialCapacity=initialCapacity;
		this.loadFactor=loadFactor;
		
		//Node
		table=new Node[this.initialCapacity];
	}
	
	public int indexFor(K key){
		int m=this.initialCapacity-1;
		return key.hashCode()%m;//����ȡ�෨;
	}	
	
	
	public V put(K key, V value) {
		int index=indexFor(key);
		Entry<K,V> element=table[index];
		if(null==element){
			table[index]=new Node(key,value,null,index);
			//map�ĳ���Ҫ��1
			size++;
		}else{
			//�ظ���ֵ
			Entry<K,V> curr=new Node(key,value,element,index);
			table[index]=curr;
		}
		return table[index].getValue();
	}
			
	public V get(K key) {
		int index=indexFor(key);
		Entry<K,V> element=table[index];
		return element==null?null:element.getValue();
	}
			
	public int size() {
		return size;
	}
		
	class Node<K,V> implements MyMap.Entry<K, V>{
		K	 key;
		V 	value;
		Entry<K,V> next;
		int index;
		
		Node(K key,V value,Entry<K,V> next,int index){
			this.key=key;
			this.value=value;
			this.next=next;
			this.index=index;
		}		
		public K getKey() {
			return key;
		}
		public V getValue() {
			return value;
		}		
	}		
}
