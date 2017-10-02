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
public class NewClass4 {
    public static int[] answer(int h, int[] q){
         int c=1,c1=0,k,c3=1,m=h;
        int[] b2=new int[q.length];
        if(h>4){ 
        for(int i=4;i<=h;i++){
            c=c*2+1;
        }
        int n=(int)Math.pow(2,h-2);
      String[] s=new String[c+1];
      s[0]="1";s[1]="2";s[2]="1";
      
      long[][] aa=new long[n][h];
      for(int i=5;i<=h;i++){
          c1=0;
          s[((int)Math.pow(2,i-3))-1]=String.valueOf(i-2);
          for(k=0;k<c;k++){
              if(s[k]==null)
              break;
          }
          for(int p=((int)Math.pow(2,i-3));c1<k-1;p++){
              s[p]=s[c1];
              c1++;
          }
      }
      int p1=0,p2=0;
      for(int i1=0;i1<n;i1++){
          aa[i1][0]=++p1;
          i1++;
          aa[i1][0]=++p1;
          if(s[p2]!=null)
          for(int p3=0;p3<Integer.parseInt(s[p2]);p3++){
              p1++;
          }
          p2++;
          
      }
      
    /*  for(int p3=0;p3<n;p3++){
          System.out.print(aa[p3][0]+" ");
      }*/
      for(int j=0;j<h-1;j++){
      
   /*   for(int i=0;i<c;i++){
          System.out.print(s[i]+" ");
      }*/
      
      
      s[0]=String.valueOf(Integer.parseInt(s[0])+Integer.parseInt(s[1]));
      s[1]=String.valueOf(Integer.parseInt(s[0])+1);
      s[2]=s[0];
      c3=(int)Math.pow(2,j+2)+1;
      for(int i=5;i<=h;i++){
          c1=0;
          s[((int)Math.pow(2,i-3))-1]=String.valueOf(c3+(i-5));
          for(k=0;k<c;k++){
              if(s[k]==null)
              break;
          }
          for(int p=(int)Math.pow(2,i-3);p<k-1;p++){
              s[p]=s[c1];
              c1++;
          }
      p1=(int)Math.pow(2,j+2)-1;p2=0;
      for(int i1=1;i1<=(int)Math.pow(2,m-2);i1++){
          aa[i1][j+1]=p1;
          if(s[p2]!=null)
          for(int p3=0;p3<Integer.parseInt(s[p2]);p3++){
              p1++;
          }
          p2++;
          
      }
      
      }
      m--;
    //  System.out.println();
      }
      m=h;int a1=0,b1=0,c5=0;
      for(int i=0;i<Math.pow(2,m-1);i++)
      {
          //System.out.print(aa[i][0]+" ");
          if(aa[i][0]==q[0]){
              a1=i;b1=0;
              break;
          }
      }
     // System.out.println();
    
        for(c3=0;c3<q.length;c3++){ 
     if(q[c3]==((int)Math.pow(2,h)-(h+1))){
         b2[c3]=q[c3]+1;
     }
     else if(q[c3]==((int)Math.pow(2,h)-1)){
         b2[c3]=-1;
     }else{
         for(int j=0;j<h-1;j++){
       
         for(int i=0;i<Math.pow(2,m-1);i++){
       if(aa[i][j]==q[c3]&&(j!=0)){
           a1=i;b1=j;
       
             } else if(aa[i][j]==q[c3]&&j==0){
        a1=i+1;b1=j;
       }
       }
     }
     if(a1%2!=0)
         a1=a1+1;
     a1=a1/2;
     b2[c3]=(int)aa[a1][b1+1];
     
     }
     //System.out.print(aa[i][j]+" ");
             //System.out.println();
         
     }}
        else{
            for(int c4=0;c4<q.length;c4++){
                if(q[c4]==1||q[c4]==2)
                    b2[c4]=3;
                else if(q[c4]==4||q[c4]==5)
                    b2[c4]=6;
                else if(q[c4]==8||q[c4]==9)
                    b2[c4]=10;
                else if(q[c4]==11||q[c4]==12)
                    b2[c4]=13;
                else if(q[c4]==3||q[c4]==6)
                    b2[c4]=7;
                else if(q[c4]==10||q[c4]==13)
                    b2[c4]=14;
                else if(q[c4]==7||q[c4]==14)
                    b2[c4]=15;
                else if(q[c4]==(int)(Math.pow(2,h)-1))
                    b2[c4]=-1;
            }
        }
       return b2;
        
    }
    public static void main(String[] arhs){
        int[] a=new int[5];
        a[0]=1;a[1]=2;a[2]=3;a[3]=127;a[4]=5;
        int b[]=NewClass4.answer(25, a);
         for(int i=0;i<5;i++){
             System.out.println(b[i]+" ");
         }
    }
}
