package DoctorTest;

import java.util.ArrayList;
import java.util.List;

public class TestCode {
    /**
     * 给定一个整数数组 nums 和一个目标值 target，
     * 请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {1, 5, 8, 2, 51, 4};
        int target = 55;
        int[] arr=arrayLength(nums, target);
        for (int a :arr) {
            System.out.println(a);
        }
    }

    /**
     *定义两数之和的函数
     * @param nums
     * @param target
     * @return list
     */
    public static int[] arrayLength(int[] nums,int target){
        //循环i次数等于传进来nums的长度
        for (int i=0;i<nums.length;i++){
            //循环j，j的初始值等于i+j，避免重复相加
            for (int j=i+1;j<nums.length;j++){
                //判断是否满足两个下标相加的值等于target
                if (nums[i]+nums[j]==target){
                    System.out.println(i+"---"+j);
                    //将满足条件的下标添加进新数组
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
}
