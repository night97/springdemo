package com.su.springdemo.night201906;

/**
 * @ProjectName: springdemo
 * @Package: com.su.springdemo.night201906
 * @ClassName: SolutionJumpFloorDemo
 * @Author:night
 * @Description:
 * @Date:2019/6/27 10:55
 */
public class SolutionJumpFloorDemo {

    public static void main(String[] args) {
        SolutionJumpFloorDemo demo = new SolutionJumpFloorDemo();
        int i = demo.jumpFloor(8,true);
        int j = demo.jumpFloor(8);
        System.out.println("i:" + i + "j:" + j);
    }

    /**
     *一只青蛙一次可以跳上1级台阶，也可以跳上2级。
     * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）
     *
     * 解题思路：首先先找规律
     * 1:1；2:1+1、2:3:1+1+1、1+2、2+1:3，之后依次类推
     * 1->1,2->2,3->3,4->5 符合斐波那契数列的规律，所以f(n) = f(n-1) + f(n-2)
     * 迭代实现
     * @param target
     * @return
     */
    public int jumpFloor(int target) {
        if (target <= 0) {
            return 0;
        }
        if (target == 1 || target == 2) {
            return target;
        }
        return jumpFloor(target -1) + jumpFloor(target -2);
    }

    /**
     * 迭代实现
     * @param target
     * @param isNext
     * @return
     */
    public int jumpFloor(int target,boolean isNext) {
        if (target <= 0) {
            return 0;
        }
        if (target == 1 || target == 2) {
            return target;
        }
        int result = 0;
        int pre = 0;
        int prePre = 1;
        for (int i = 1; i <= target; i ++ ) {
            result = pre + prePre;
            pre = prePre;
            prePre = result;
        }
        return  result;
    }

    /**
     * 一只青蛙一次可以跳上1级台阶，
     * 也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
     *
     * 解题思路： f(n) = 2 * f(n-1) -> 2的（n-1）次方
     */
    public class Solution {
        public int JumpFloorII(int target) {
            if (target <= 0) {
                return 0;
            }
            return (int) Math.pow(2,target -1);
        }

//        int jumpFloorII(int number) {
//            //位运算 相当于1 * 2（nummber -1）次方
//            return 1<<(number-1);
//        }

        int jumpFloorII (int number) {
            if (number <= 0) {
                return 0;
            }
            if (number == 1) {
                return 1;
            }
            return 2 * jumpFloor(number - 1);
        }

    }
}
