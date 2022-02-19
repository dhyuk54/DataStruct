package com.hyuk;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {5,3,7,2,1,9,8,4};
        selection(array);
    }

    private static void selection(int[] array){
        for (int i = 0; i < array.length; i++) {
            int s = i; // 默认第一个元素假设为最小的初始值index
            for (int j = s+1; j < array.length; j++) { // 第一个元素和第二个元素进行比较
                if (array[s] > array[j]){
                    s = j; // 第0个元素大于第1个把最小的值和原来假设最小的index初始化进行互换
                }
            }
            if (s != i){ // 假设的最小值index和array数组中的元素index不相等时进行交换
                swap(array,s,i);
            }
            System.out.println(Arrays.toString(array));
        }
    }

    public static void swap(int[] array,int s,int i){
        int temp = array[s];
        array[s] = array[i];
        array[i] = temp;
    }
}
