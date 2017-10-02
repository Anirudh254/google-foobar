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
public class NewClass1 {
       public static int answer(int[] l){
      int i1,j1,k1,i,j,k,c=0;
      
      for(int p=0;p<999999;p++){
          l[p]=p+1;
      }
      for(i=0;i<l.length-2;i++){
          i1=l[i];
          for(j=i+1;j<l.length-1;j++){
              j1=l[j]; 
              if(j1%i1==0){
              for(k=j+1;k<l.length;k++){
                  k1=l[k];
                  //System.out.print(i1+" "+j1+" "+k1+"  ");
                  if(k1%j1==0){
                      c++;
                  }
                  //System.out.println();
              }
              }
              else
                  continue;
          }
      }
         return c;
}
  public static void main(String[] args){
      int[] a=new int[999999];
      System.out.println(NewClass1.answer(a));
       }   
}

