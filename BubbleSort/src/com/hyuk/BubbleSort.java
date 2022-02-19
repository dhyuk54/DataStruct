package com.hyuk;

import java.util.Arrays;

/*
比较次数0
比较次数1
比较次数2
比较次数3
比较次数4
比较次数5
比较次数6
第4轮冒泡[2, 5, 4, 1, 3, 7, 8, 9]
比较次数0
比较次数1
比较次数2
比较次数3
第3轮冒泡[2, 4, 1, 3, 5, 7, 8, 9]
比较次数0
比较次数1
比较次数2
第2轮冒泡[2, 1, 3, 4, 5, 7, 8, 9]
比较次数0
比较次数1
第0轮冒泡[1, 2, 3, 4, 5, 7, 8, 9]
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5,2,7,4,1,3,8,9};
        bubble_v2(array);
    }

    public static void bubble_v2(int[] array){
        int  n = array.length -1 ;
        while (true){
            int last = 0;
            for (int i = 0; i < n; i++) {
                System.out.println("比较次数" + i);
                if (array[i] > array[i+1]) {
                    swap(array,i,i+1);
                    last = i;
                }
            }
            n = last;
            System.out.println("第" + n + "轮冒泡" + Arrays.toString(array));
            if (n == 0) {
                break;
            }
        }
    }

    public static void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
