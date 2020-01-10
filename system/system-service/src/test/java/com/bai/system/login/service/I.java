package com.bai.system.login.service;

import java.math.BigInteger;

/**
 * @ Author     : BaiZhongYing
 * @ Date       : Created in 16:41 2018/9/30
 * @ Description:
 * @ Modified By:
 * @ Version: $version
 */
public class I {

    public static void main(String[] args) {

//        十六进制转成十进制
//        Integer.valueOf("FFFF",16).toString();
//        八进制转成十进制
//        Integer.valueOf("876",8).toString();
//        二进制转十进制
//        Integer.valueOf("0101",2).toString();

//        System.out.println(toBinary("白"));


        /**
         * 题目：打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，
         * 其各位数字立方和等于该数本身。例如：153是一个 "水仙花
         数 "，因为153=1的三次方＋5的三次方＋3的三次方
         */
        for (int i = 100; i <1000 ; i++) {
            int firstNum = i/100;
            int secondNum = i/10%10;
            int thirdNum = i%10;
            if(firstNum*firstNum*firstNum + secondNum*secondNum*secondNum+thirdNum*thirdNum*thirdNum == i){
                System.out.println("水仙花数为：" + i);
            }
        }

    }
    public static String toBinary(String str){
        //把字符串转成字符数组
        char[] strChar=str.toCharArray();
        String result="";
        for(int i=0;i<strChar.length;i++){
            //toBinaryString(int i)返回变量的二进制表示的字符串
            //toHexString(int i) 八进制
            //toOctalString(int i) 十六进制
            result +=Integer.toBinaryString(strChar[i])+ " ";
        }
        return result;
    }




}
