package com.one.one;

public class two {
    private int a;
    private void aVoid(int a){
        a++;
    }
    public static void main(String [] args){
        two two1=new two();
       // System.out.println(two1.a);
        two1.aVoid(two1.a);
        //System.out.println(two1.a);
        int b=0;
        two1.aVoid(b);
        System.out.println(b);
    }
}
