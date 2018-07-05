package com.sz.test;

public class VariableLengthArgumentsMethod {


    /**
     * Number ...nums 可变参数
     * @param nums
     * @return
     */
    public int sum(Integer ...nums){
        int sum = 0;
        for(int i = 0 ; i < nums.length; i ++){
            sum += nums[i];
        }
        return sum;
    }


    // 可变参数列表声明必须出现在参数列表的最后面，可变参数只能有一项
    public void show(String str, Character c, Number ... strs){

    }


}




