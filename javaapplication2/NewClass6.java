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
public class NewClass6 {
    
    
    public static int Betting(int x, int y) {
       int[] x1=new int[100];
       int[] y1=new int[100];
       int i=0,flag=-1;
       x1[i]=x;y1[i]=y;
       while(i<99){ 
       if(y1[i]==x1[i]){
         flag=0;
         break;
       }
          else if(y1[i]>x1[i]){
        x1[i+1]=x1[i]*2;
        y1[i+1]=y1[i]-x1[i];
        for(int j=0;j<i;j++){
            if(x1[j]==y1[i]||x1[j]==x1[i]){
                flag=1;
                break;
            }
        }
        if(flag==1)
            break;
       }
       else if(x1[i]>y1[i]){
        x1[i+1]=x1[i]-y1[i];
        y1[i+1]=y1[i]*2;
        for(int j=0;j<i;j++){
            if(x1[j]==y1[i]||x1[j]==x1[i]){
                flag=1;
                 }
        
        }
        if(flag==1)
            break;
       }
       i++;
       }
        return flag;
    }
  public static void main(String[] args){
      int[] list={1, 7, 3, 21, 13, 19};
              //new int[100];
      int len=list.length;
      int t,p=0;
      //list[0]=1;list[1]=1;
    /* for(int i=0;i<len;i++){
          list[i]=i+1;
      }*/ 
      boolean flagg = true;
int first = list[0];
for(int i = 1; i < len && flagg; i++)
{
  if (list[i] != first) 
      flagg = false;
}
if (flagg){
    System.out.println(len);
}
      
       
      int[][] pairs=new int[100][100];
      int k=0;
       for(int i=0;i<len;i++,k=0){
          for(int j=0;j<len;j++){
              int flag=NewClass6.Betting(list[i], list[j]);
              if(flag==1){
                  pairs[i][k]=1;
                          //list[j];
                 // System.out.print(list[j]+" ");
                 
              }
              k++;
          }
           // System.out.println();
      }
       int count=0,count1=0,c=0;
       int[][] pairs1=new int[len][len];
       for(int i=0;i<len;i++){
           for(int j=0;j<len;j++){
               pairs1[i][j]=pairs[i][j];
           }
               
       }
       for(k=0;k<3;k++){
       count=0;
          for(int i=0;i<len;i++){
           for(int j=0;j<len;j++){
               if(pairs[i][j]!=0){
                   count++;
                   //pairs1[i][j]=0;
                   for(int i1=0;i1<len;i1++){
                       pairs[i][i1]=0;
                       pairs[j][i1]=0;
                       pairs[i1][i]=0;
                       pairs[i1][j]=0;
                   }
                  break; 
               }
               
           }
       //    pairs=pairs1;
           
       }  c=0;
          for(t=0;t<len;t++){
              
              for(p=0;p<len;p++){
                  if(pairs1[t][p]!=0){
                      //pairs2[i][j]=0;
                      pairs1[t][p]=0;
                      c=1;
                      break;
                  }
                      
              }
              if(c==1){
                  break;
              }
          }
        //  System.out.println(count);
       if(count>count1){
               count1=count;
           }
       for(int l=0;l<len;l++){
           for(int m=0;m<len;m++){
               pairs[l][m]=pairs1[l][m];
           }
       }
       }
       System.out.println(count1);
       /*for(int i=0;i<len;i++){
           for(int j=0;j<len;j++){
              System.out.print(pairs1[i][j]+" ");
          }
           System.out.println();
       }
      /*   for(int i=0;i<len;i++){
           for(int j=0;j<len;j++){
              System.out.print(pairs[i][j]+" ");
          }
   System.out.println();
           }*/
  }
}
