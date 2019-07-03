package com.su.springdemo.sort;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.sort
 * @ClassName: Sort
 * @Author:night
 * @Description:
 * @Date:2019/7/2 10:03
 */
public abstract class Sort<T extends Comparable<T>> {

    public abstract void sort(T[] numbers);

    protected boolean less(T v, T w) {
        //v 比 w 要小
        return v.compareTo(w) < 0;
    }

    protected void swap(T[] a,int i, int j) {
        T t = a[j];
        a[j] = a[i];
        a[i] = t;
    }
}
