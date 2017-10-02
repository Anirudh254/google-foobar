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
public class NewClass {
    
    public static int answer(String s){
         int len=s.length();
         int[] a=new int[100];//Factor's array
         int i,c=0,c3=0,j=0;
         boolean flag=false;
         
         boolean c1=false;
       for(int k=0;k<s.length();k++){
            c1=false;
           for(char j1=97;j1<123;j1++){
            
               if(s.charAt(k)==j1)
                 c1=true;
           }
       if(!c1){
           break;
       }
       }
         for(i=1;i<=len;i++){//calculating factors
             if(len%i==0){
                 a[j]=i;
                 j++;
             }
         }
         for(i=0;i<100;i++,c++){
             if(a[i]==len)
                 break;
         }
   /*      if((c==1&&c1)||(len==1&&c1)){
             
             for(j=1;j<s.length();j++){
                 if(!(ss[0].equals(ss[j]))) flag=false;
                         
         }
             
             
             
             return 1;
         }else{*/
       if(c1&&(len<200)){
         
         for(i=1,j=0;i<=len;i++){//calculating factors
             if(len%i==0){
                 a[j]=i;
                 j++;
             }
         }
         for(i=0;i<100;i++,c++){
             if(a[i]==len)
                 break;
         }
         String s1="",s2="";
         for(i=0;i<=c;i++){
             String[] ss=new String[len/a[i]];
            
             for(j=0;j<a[i];j++){
                 s1+=".";
             }
             
             ss=s.split("(?<=\\G"+s1+")");
             flag=true;
         for(j=1;j<ss.length;j++){
                 if(!(ss[0].equals(ss[j]))) flag=false;
                         
         }
         if(a[i]==1&&flag==true){
             c3=len;
             break;
         }
         if(flag==true){
             c3=len/a[i];
         break;
         }
         
         ss=null;
         s2="";
         s1="";
         }
         
         if(flag==true)
        return c3;
         else
             return 1;
         }
         else
             return 0;
 //   }
    }
    
    public static void main(String[] args){
     String s="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        int n=NewClass.answer("avbhabjvd");
    System.out.println(n);
    System.out.println(s.length());
    }
}
