package com.test.twelve;

public class Run {
    public static void add(){
        System.out.println("1、除法计算开始。");
        int result=0;
        try {
            int x = Integer.parseInt("0");
            int y = Integer.parseInt("0");
            result = x / y;
            return;
            
            } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("不管是否出现异常都执行");
        }
        System.out.println("3、除法计算结束。");
    }
    public static void main(String[] args){
            add();
         }
}
