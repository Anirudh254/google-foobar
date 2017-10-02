/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Go
 */
public class foo_1_1 {
    public static void main(String[] args)
    {
        int c=0,n=0;
        int[] x={13, 5, 6, 2, 5};
        int[] y={5, 2, 5, 13};
        if(x.length>y.length){
            for(int i=0;i<x.length;i++){
                c=0;
                for(int j=0;j<y.length;j++){
                if(x[i]==y[j])
                c=1;
            }
            if(c==0){
            n=x[i];
            break;
            }
            }
        }
        else{
            for(int i=0;i<y.length;i++){
                c=0;
                for(int j=0;j<x.length;j++){
                if(y[i]==x[j])
                c=1;
            }
            if(c==0){
            y[i]=n;
            break;
            }
            }
        }
        System.out.println(n);
}
}
