package com.su.springdemo.sort;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.sort
 * @ClassName: BubbleSort
 * @Author:night
 * @Description:
 * @Date:2019/7/2 10:23
 */
public class BubbleSort<T extends Comparable<T>> extends Sort<T> {

    /**
     * 从左到右不断交换相邻逆序的元素，在一轮的循环之后，可以让未排序的最大元素上浮到右侧。
     *
     * 在一轮循环中，如果没有发生交换，那么说明数组已经是有序的，此时可以直接退出。
     * @param numbers
     */
    @Override
    public void sort(T[] numbers) {
        boolean isOver = false;
        for (int i = 0; i < numbers.length - 1 && !isOver;i ++) {
            isOver = true;
            for (int j = i;j < numbers.length -1;j ++) {
                if (less(numbers[j],numbers[j+1])) {
                    isOver = false;
                    swap(numbers,j,j+1);
                }
            }
        }
    }
}
