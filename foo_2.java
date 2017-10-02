/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Go
 */
public class foo_2 {
    public static void main(String[] args){
    int c=0,k=0;
    int[] l={1, 2, 3, 4};
    int t=15;
        int[] a=new int[l.length];
        for(int i=0;i<l.length;i++){
            c=0;
            for(int j=i;j<l.length;j++){
               c+=l[j];
                if(c==t){
                 a[k]=i;
                 k++;
               }
               
               
            }
        }
        
    int[] b=new int[k];
    for(int i=0;i<k;i++)
    b[i]=a[i];
    if(k==0)
    {
     int[] b1=new int[2];
     b1[0]=-1;b1[1]=-1;
     for(int i=0;i<2;i++)
     System.out.println(b1[i]);
    }
    else{
    for(int i=0;i<b.length;i++)
    System.out.print(b[i]+" ");
    }
}
}