package com.su.springdemo.sort;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.sort
 * @ClassName: Main
 * @Author:night
 * @Description:
 * @Date:2019/7/2 10:17
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("--------------选择排序-----------------");
        SelectSortTest();
        System.out.println("--------------冒泡排序------------------");
        BubbleSortTest();
    }

    private static void SelectSortTest() {
        Integer[] numbers = new Integer[]{2,3,1,4,5};
        Sort<Integer> sort = new SelectSort<>();
        sort.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers" + i + ":" + numbers[i]);
        }
    }
    private static void BubbleSortTest() {
        Integer[] numbers = new Integer[]{2,3,1,7,9,4,5,10};
        Sort<Integer> sort = new BubbleSort<>();
        sort.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers" + i + ":" + numbers[i]);
        }
    }
}
