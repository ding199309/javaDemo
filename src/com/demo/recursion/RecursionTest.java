package com.demo.recursion;

import java.util.ArrayList;
import java.util.List;

/** 
* @author   dfz
* 作者 E-mail:  dfz@jkinvest.cn
* @date 创建时间：2017年4月20日 上午11:11:45 
* @version 1.0   递归
* @parameter  
* @since  
* @return  
*/
public class RecursionTest {
	static char[] chars="abc".toCharArray();
	

	public static void main(String[] args) {
		for(int i=0;i<chars.length;i++){
            //取得每一个字符
            List<Integer> list=new ArrayList<Integer>();
            list.add(i);
            System.out.println("i================"+i);
            play(list);
        }
	}	
    //使用递归，每次加上列表中不存在的一个字符
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
    //打印列表内容
    private static void print(List<Integer> list){
        for(Integer i:list){
  //          System.out.print(chars[i]+"");
   //     System.out.println();
        }
    }
	
    
    
    
    
    
    
    
}
