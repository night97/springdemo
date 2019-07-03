package com.su.springdemo.night201906;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.night201906
 * @ClassName: SolutionRotateDemo
 * @Author:night
 * @Description:
 * @Date:2019/6/25 16:56
 */
public class SolutionRotateDemo {

    public static void main(String[] args) {
        int[] array = new int[]{4,5,6,1,2,3};
        int result = minNumberInRotateArray(array,true);
        System.out.println("result:" + result);
    }

    /**
     * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
     * 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
     * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
     * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
     *
     * 思路
     * 传进去旋转数组，注意旋转数组的特性：
     * 1.包含两个有序序列
     * 2.最小数一定位于第二个序列的开头
     * 3.前序列的值都>=后序列的值
     * 定义把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
     * ^_^这个旋转思想是很经典的
     * 旋转数组实例：
     * {123456}旋转后{456123}
     *
     * @param array
     * @return
     */
    public static int minNumberInRotateArray(int [] array) {
        if (array.length == 0) {
            return 0;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i+1]) {
                return array[i+1];
            }
        }
        return array[0];
    }

    public static int minNumberInRotateArray(int [] array,boolean isMid) {
        int low = 0 ;
        int high = array.length - 1;
        while(low < high){
            int mid = low + (high - low) / 2;
            if(array[mid] > array[high]){
                low = mid + 1;
            }else if(array[mid] == array[high]){
                high = high - 1;
            }else{
                high = mid;
            }
        }
        return array[low];
    }

}
