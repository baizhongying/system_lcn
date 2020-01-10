package com.bai.system.login.service;

/**
 * @ Author     : BaiZhongYing
 * @ Date       : Created in 16:23 2018/9/30
 * @ Description:
 * @ Modified By:
 * @ Version: $version
 */
public class 逻辑运算 {


    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("b >= a = " + (b >= a));
        System.out.println("b <= a = " + (b <= a));


        System.out.println(true ^ false);
        boolean o = true;
        boolean i = false;
        System.out.println("i && i = " + (i && i));//false
        System.out.println("o && i = " + (o && i));//false
        System.out.println("o & i = " + (o & i));
        System.out.println("i & o = " + (i & o));

    }


}
