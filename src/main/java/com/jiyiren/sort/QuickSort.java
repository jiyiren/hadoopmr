package com.jiyiren.sort;

/**
 * @author yiji
 * @version v1.0.0
 * @date 2018/3/1 下午4:10
 * @Description
 */

public class QuickSort {
    public static void sort(int arr[],int left, int right){
        if(left>=right){
            return;
        }
        int i = left;
        int j = right;
        int key = arr[i];

        while(i<j){
            while(i<j && key<=arr[j]){
                j--;
            }
            arr[i]=arr[j];
            while (i<j && key>=arr[i]){
                i++;
            }
            arr[j]=arr[i];
        }
        arr[i] = key;
        sort(arr,left,i-1);
        sort(arr,i+1,right);
    }

    public static void print(int arr[]){
        for (int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[]={6,2,7,3,8,9};

        print(arr);
        sort(arr,0,5);
        print(arr);
    }
}
