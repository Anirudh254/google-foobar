/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Go
 */
public class NewClass2 {
    public static void main(String[] args){
     long c=1,i=0,x=100000,y=100000, p=0;
     String[] a=new String[100000];
    // int[][] aa=new int[100000][100000];
        for(i=0;i<100000;i++){
            c+=i;
            int k=(int)i;
            a[k]=String.valueOf(c);
        }
       // for(int j=0;j<y;j++){
           int j=(int)y-1;
          c=Long.parseLong(a[j])-1;
            
          for(int k=0;k<x;k++){
              c++;
              p=c;
              c+=k+(y-1)+1;
          }
       // }
        System.out.println(p);
    //    for(int j=0;j<4;j++){
      //      for(int k=0;k<4;k++){
     // String s=String.valueOf(aa[10][25]);
         //       System.out.print(s);
        //    }
          //  System.out.println();
       // }
 /*   for(int k=0;k<100000;k++){
        System.out.print(a[k]+" ");
    }*/
    }
    
}
