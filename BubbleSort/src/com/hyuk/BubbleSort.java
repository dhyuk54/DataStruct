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
        // 1.计算出要比较数组中的总长度
        // 2.数组的总长度赋给一个临时变量
        int  n = array.length -1 ;
        while (true){
            int last_index = 0;
            for (int i = 0; i < n; i++) {
                System.out.println("比较次数" + i);
                if (array[i] > array[i+1]) { // 当第一个数和第二个数进行比较时 按升序排序
                    swap(array,i,i+1); // 交换位置
                    // 1.记录当前交换位置的index为最终last_index
                    // 2.从这个index值之后就不需要发生不必要的swap,
                    last_index = i;
                }
            }
            n = last_index; // 当元素中没有要可交换的值之后 退出 while循环
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
