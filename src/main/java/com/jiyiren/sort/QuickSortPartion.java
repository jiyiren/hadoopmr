package com.jiyiren.sort;

/**
 * @author yiji
 * @version v1.0.0
 * @date 2018/3/1 下午4:47
 * @Description
 */

public class QuickSortPartion {

    public static int partition(int arr[],int left, int right){
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
        return i;
    }
    public static void sort(int arr[],int left, int right){
        if(left>=right){
            return;
        }
        int index = partition(arr,left,right);
        sort(arr,left,index-1);
        sort(arr,index+1,right);
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
