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
public class NewClass3 {
    public static void main(String[] args){
        int i=0;int h=5,item,parent=0;
        int root=((int)Math.pow(2,h))-1;
        int root1=root;
        int c=0,h1=h;
        int list[]={19,14,28,31};
        int list1[]=new int[list.length];
        for(int j=0;j<list.length;j++){
            item=list[j];
            i=0;h=5;parent=0;
        root=root1;
        c=0;
        
            if(item==root1){
                list1[j]=-1;
                continue;
            }
            else{
        while(true){
            
            if((root-(int)Math.pow(2, h-1))>item){
                
                root=root-(int)Math.pow(2, h-1);
                c=0;
                h--;
            }
            else if((root-(int)Math.pow(2, h-1))<item){
                root=root-1;
                c=1;
                h--;
            }
            else {
                if(c==0){
                    parent=root;
                    break; 
                }
                else{
                    parent=root;
                break;
                }
            }
            if(c==0){
                if(item==root){
                    parent=(int)Math.pow(2, h+1)-1;
                    break;         
                 }
            }
            else if(c==1){
                if(item==root){
                    parent=root+1;
                break;
                }
            }
            /*if((root-(int)Math.pow(2, h-1))==item){
                parent=root;
                break;
            }
            else if(item==(root-1)){
                parent=root;
                break;
            }*/
        
        }
      }
        list1[j]=parent;
        }
        for(int j=0;j<list.length;j++)
        System.out.println(list1[j]);
   }   
}

