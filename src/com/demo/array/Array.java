package com.demo.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		int[] a={1,2,3};
		int[] b={4,1,6};
		a=Arrays.copyOf(a, a.length+b.length);
		System.arraycopy(b, 0, a, a.length-b.length, b.length);
		System.out.println(Arrays.toString(a));		
		for(int i=0;i<a.length-1;i++){
			for (int j =0; j < a.length-i-1; j++) {
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));	
		
		List<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}
		for (int i = 0; i < list.size(); i++) {
			boolean flag=false;
			for (int j = i+1; j < list.size()-i; j++) {
				if(list.get(i)==list.get(j)){
					flag=true;
					break;
				}
			}
			if(flag){					
				list.remove(i);
			}
		}
		System.out.println(list.toString());
	}
}
