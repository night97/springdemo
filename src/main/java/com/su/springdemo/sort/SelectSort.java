package com.su.springdemo.sort;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.sort
 * @ClassName: SelectSort
 * @Author:night
 * @Description:
 * @Date:2019/7/2 10:08
 */
public class SelectSort<T extends Comparable<T>> extends Sort<T> {
    /**
     * 从数组中选择最小元素，将它与数组的第一个元素交换位置。
     * 再从数组剩下的元素中选择出最小的元素，将它与数组的第二个元素交换位置。
     * 不断进行这样的操作，直到将整个数组排序。
     * 选择排序需要 ~N2/2 次比较和 ~N 次交换，
     * 它的运行时间与输入无关，这个特点使得它对一个已经排序的数组
     * 也需要这么多的比较和交换操作。
     * @param numbers
     */
    @Override
    public void sort(T[] numbers) {
        for(int i = 0; i < numbers.length -1;i ++) {
            int min = i;
            for (int j = i + 1; j < numbers.length - 1; j ++ ) {
                if (less(numbers[j],numbers[min])){
                    min = j;
                }
            }
            swap(numbers,i,min);
        }
    }
}
