package com.demo.recursion;

import java.util.ArrayList;
import java.util.List;

/** 
* @author   dfz
* ���� E-mail:  dfz@jkinvest.cn
* @date ����ʱ�䣺2017��4��20�� ����11:11:45 
* @version 1.0   �ݹ�
* @parameter  
* @since  
* @return  
*/
public class RecursionTest {
	static char[] chars="abc".toCharArray();
	

	public static void main(String[] args) {
		for(int i=0;i<chars.length;i++){
            //ȡ��ÿһ���ַ�
            List<Integer> list=new ArrayList<Integer>();
            list.add(i);
            System.out.println("i================"+i);
            play(list);
        }
	}	
    //ʹ�õݹ飬ÿ�μ����б��в����ڵ�һ���ַ�
    private static void play(List<Integer> list){
    	//if(list.size()==chars.length){		
    		print(list);
    //	}
        for(int i=0;i<chars.length;i++){
            if(!list.contains(i)){
                List<Integer> temp=new ArrayList<Integer>(list);
                temp.add(i);
                for(Integer t:temp){
                	System.out.print("===t="+t);
                }    
                System.out.println();
                play(temp);
            }
        }
    }
    //��ӡ�б�����
    private static void print(List<Integer> list){
        for(Integer i:list){
  //          System.out.print(chars[i]+"");
   //     System.out.println();
        }
    }
	
    
    
    
    
    
    
    
}
