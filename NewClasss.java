/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Go
 */
public class NewClasss {
    
    public static int appearanceCount(int input1,int input2,String input3,String input4){
	    //Write code here
	   int len=input1,c=1;
            while(len>0){
            c*=len;
            len--;
        }
            String s;
    String ss[]= new String[c];
    for(int i=0;i<c;i++){
       s=input3;
       for(int j=0;j<c;j++){
        if(j!=i)
            s.replace(s.charAt(i), s.charAt(j));
        ss[j]=s;
        }
    }
    return 0;
    }
    private static String[] permutation(String prefix, String str,int c) {
    int n = str.length();
    int j=0;
    String[] st=new String[c];
    if (n == 0) st[j++]=prefix;
    else {
        for (int i = 0; i < n; i++)
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), c);
    }
    return st;
}
    public static void main(String[] args){
        int n=5,input1=4;String input3="abcd";
    int len=input1,c=1;
            while(len>0){
            c*=len;
            len--;
        }
            String s;
    String ss[]= new String[c];
    for(int i=0;i<4;i++){
       s=input3;
       for(int j=0;j<4;j++){
        if(j!=i){
            
        }
       }
    }    
    String[] svv=permutation("","abcd",16);
    
    for(int j=0;j<16;j++){
        System.out.println(svv[j]);
    }
    String sss="avuid";
    
    System.out.println(sss.replace('i', 'b'));
    }
    
}
