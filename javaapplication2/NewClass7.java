/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.math.BigInteger;

/**
 *
 * @author Go
 */
public class NewClass7 {
    public static String answer(String M, String F) {
        
        String s1=M,s2=F;
        BigInteger m=new BigInteger(M);
        BigInteger n=new BigInteger(F);
        BigInteger z=new BigInteger("0");
        BigInteger one=new BigInteger("1");
        BigInteger c=new BigInteger("0");
        BigInteger c1=new BigInteger("0");
        BigInteger x;BigInteger y;
        x=m.mod(n);y=n.mod(m);
        if((x.equals(z)||y.equals(z))&&(!m.equals(one))&&(!n.equals(one))){
            c1=new BigInteger("0");
        }
        else {
while(true)
{
    int l=m.compareTo(n);
  if(l==1&&(n.intValue()>0))
  {
   c=m.divide(n);
   c1=c1.add(c);
   m=m.subtract(n.multiply(c));
  }
  else if(l==-1&&(m.intValue()>0))
  {
      c=n.divide(m);
   c1=c1.add(c);
   n=n.subtract(m.multiply(c));
  }
  if(l==0)
  {
   break;
  }
  if(m.equals(null)||n.equals(null))
  {
  c1=new BigInteger("0");
  break;
  }
  int co = m.compareTo(z);
  int co1 = n.compareTo(z);
  
  if(co==0||co1==0)
  {
   if(co==1){
   c1=c1.subtract(n);
   c1=c1.subtract(one);
   }if(co1==1){
   c1=c1.subtract(m);
   c1=c1.subtract(one);
   }
   break;  
  }
}
        }
if(c1.compareTo(z)<=0)
return "impossible";
else
return String.valueOf(c1.intValue());
    }
  public static void main(String[] args){
     System.out.println(NewClass7.answer("1", "1"));
     
  }
}
