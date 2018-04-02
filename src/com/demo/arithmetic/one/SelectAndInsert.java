package com.demo.arithmetic.one;


import java.util.Arrays;

/**   选择排序，插入排序， 插入排序优化，   冒泡排序
 * Created with IntelliJ IDEA.
 * User: woting
 * Date: 2018/3/21
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class SelectAndInsert {

    static int[] arr={2,4,5,6,1,3,8,9,7,0};

    static void select(){
        for(int i=0;i<arr.length;i++){
            int index=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[index]){
                    index=j;
                }
            }
            int x=arr[i];
            arr[i]=arr[index];
            arr[index]=x;

        }
        System.out.println(Arrays.toString(arr));
    }

    static  void  insert(){
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                    if(arr[j]<arr[j-1]){
                            int x=arr[j];
                            arr[j]=arr[j-1];
                            arr[j-1]=x;
                    }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

//        select();//选择排序
        insert();
    }


}
