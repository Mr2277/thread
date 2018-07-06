package com.one.one;
class B{
    public int b;
}
public class two {
    private int a;
    private String string="ttttt";
    private void aVoid(int a){
        a++;
        System.out.println(a);
    }
    private void aVoid(String s){
        s+="";
    }
    public static void main(String [] args){
        two two1=new two();
       // System.out.println(two1.a);
        //two1.aVoid(two1.a);
        //System.out.println(two1.a);
        //nt b=0;
        //two1.aVoid(b);
        //System.out.println(b);
        //B b1=new B();
        //two1.aVoid(b1.b);
        //System.out.println(b1.b);
        String s="new";
        two1.aVoid(s);
        System.out.println(s);
    }
}
