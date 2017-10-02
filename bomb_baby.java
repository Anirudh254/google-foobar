package com.google.challenges; 
import java.math.BigInteger;
public class Answer {   
    public static String answer(String M, String F) { 

        // Your code goes here.
BigInteger m=new BigInteger(M);
        BigInteger n=new BigInteger(F);
        BigInteger z=new BigInteger("0");
        BigInteger one=new BigInteger("1");
        BigInteger c=new BigInteger("0");
        BigInteger c1=new BigInteger("0");
     if((m.compareTo(one)==0&&n.compareTo(one)==1)||(n.compareTo(one)==0&&m.compareTo(one)==1)){
         if(m.compareTo(one)==0){
          n.subtract(one);
             return String.valueOf(n.subtract(one));
         }
             if(n.compareTo(one)==0)
             {
                 
             return String.valueOf(m.subtract(one));
     }}
     else if(m.compareTo(z)==0||n.compareTo(z)==0)
             {
                 c1=z;
                 
             }
     else if((m.compareTo(one)==0)&&(n.compareTo(one)==0))
             {
                 c1=c1.add(one);
                 c1=c1.add(one);
             }
     else if((m.mod(n).compareTo(z)==0)||(n.mod(m).compareTo(z)==0))
             {
                 c1=c1.add(one);
             }
     else {
         while(m.compareTo(z)==1&&n.compareTo(z)==1){
           if(m.compareTo(one)==0&&n.compareTo(one)==0)
                 break;  
             if((n.mod(m).compareTo(z))==-1||(m.mod(n).compareTo(z))==-1){
                     c1=z;
                     break;
                 }
             int l=m.compareTo(n);
             if(l==1)
             {
                 c=m.divide(n);
                 if((m.mod(n).compareTo(z))==0&&m.longValue()!=1&&n.longValue()!=1){
                     c1=z;
                     break;
                 }
                 c1=c1.add(c);
                 m=m.subtract(n.multiply(c));
             }
             else if(l==-1)
             {
                 c=n.divide(m);
                 if((n.mod(m).compareTo(z))==0&&m.longValue()!=1&&n.longValue()!=1){
                     c1=z;
                     break;
                 }
                 
                 c1=c1.add(c);
                 n=n.subtract(m.multiply(c));
             }
         }
     }
     if(c1.compareTo(one)==1)
    return String.valueOf(c1.subtract(one));
     else
         return "impossible";
    } 
}