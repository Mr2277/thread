package com.one.one;

import java.util.ArrayList;
import java.util.List;

class a{
    private byte aByte[]=new byte[1024*1024];
}
class b{
    private byte aByte[]=new byte[10*1024*1024];
}
class c{
    private byte aByte[]=new byte[3*1024*1024];
}
public class Test {
    public static void main(String[] args){
       /*
        int x=103;
        for(int i=1;i<=3;i++){
            //x=2*x+1;
            x=(x-1)/2;
        }
        System.out.println(x);
        */
       //byte b[]=new byte[1024*1024];
        /*
       for(int i=0;i<3;i++){
           if(i<2) {
               new a();
           }
           else{
               new b();
           }
       }
       */

       // for(int i=0;i<2;i++){
         //   new a();
       // }
       // new a();
        //new b();
        //new b();
        /*
        for(int i=0;i<4;i++) {
           // new c();
         //   new c();
        }
        */
       // System.gc();
       c c1=new c();
        //System.gc();
       c c2=new c();
       c c3=new c();
      //  a a1=new a();
       // a a2=new a();
    }
}
