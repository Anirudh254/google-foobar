/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Go
 *///(s+1+(l*(l-1)))
public class NewClass5 {
    public static void main(String[] args){
        int s=0,l=3,p=l,c=0;
        for(int i=s;i<(s+1+(p*(p-1)));i=i+p){
        for(int j=i;j<i+l;j++){
         c^=j;
        }
        l--;
        }
     System.out.println(c);
    }
   
}
