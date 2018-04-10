package com.demo.array;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author dfz
 * @email dfz@jkinvest.cn
 * @create 2018-03-13 16:36
 * @since 1.0
 */
public class Quick{
    public void sort(int arr[],int low,int high){
        int l=low;
        int h=high;
        int povit=arr[low];
        while(l<h){
            while(l<h&&arr[h]>=povit) {h--;}

            if(l<h){
                int temp=arr[h];
                arr[h]=arr[l];
                arr[l]=temp;
                l++;
            }

            while(l<h&&arr[l]<=povit) {l++;}

            if(l<h){
                int temp=arr[h];
                arr[h]=arr[l];
                arr[l]=temp;
                h--;
            }
        }
        System.out.println(Arrays.toString(arr));
//        System.out.print("l="+(l+1)+"h="+(h+1)+"povit="+povit+"\n");
        if(l>low) {
            sort(arr, low, l - 1);
        }
        if(h<high) {
            sort(arr, l + 1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr={3,1,6,2,7,9,5,0,8,4};
        new Quick().sort(arr,0,9);
    }
}