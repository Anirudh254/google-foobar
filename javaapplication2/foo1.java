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
public class foo1 {
    public static void main(String[] args){
        int[] a={0,0,0};
        int[] b=new int[a.length];
        int i=0,j=0,f=0,n=2,k=0;
        for(i=0;i<a.length;i++){
           f=0;
            for(j=0;j<a.length;j++){
             if(a[i]==a[j])
                 f++;
        }
            if(f<=n){
                b[k]=a[i];
               k++;
            }
            
        }
        for(k=0;k<b.length;k++)
        System.out.print(b[k]+"  ");
    }
}
