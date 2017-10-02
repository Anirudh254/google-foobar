/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Go
 */
public class NewClass {
    int a[][]={{0,0,0,0,0,0},{1,1,1,1,1,0},{0,0,0,0,0,0},{0,1,1,1,1,1},{0,1,1,1,1,1},{0,0,0,0,0,0}};
        String[][] s=new String[6][6];
        int c=0;
    public static void main(String[] args){
      NewClass a=new NewClass();
    System.out.println(a.trace(0, 1));
    }    

    public NewClass(){
        //System.out.println(s.length);
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                if(i<5 && a[i+1][j]==0)//bottom
                {
                    if(s[i][j]!=null)
                    s[i][j]+="B";
                    else
                        s[i][j]="B";
                }
                if(j<5 && a[i][j+1]==0)//right
                {
                    if(s[i][j]!=null)
                    s[i][j]+="R";
                    else
                        s[i][j]="R";
                }
                if(i>0 && a[i-1][j]==0)//upper
                {
                                   if(s[i][j]!=null)
                    s[i][j]+="U";
                    else
                        s[i][j]="U";
 }
                if(j>0 && a[i][j-1]==0)//left
                {
                                   if(s[i][j]!=null)
                    s[i][j]+="L";
                    else
                        s[i][j]="L";
 }
            }
        }
    /*    for(int i=0;i<6;i++){
            for(int j=0;j<6;j++)
            {
                System.out.print(s[i][j]+"  ");
            }
            System.out.println();
        }*/
    
        
    }
    int k=0;
    public int trace(int i, int j){
        if(i==5&&j==5){
            return c;
        }
        if(i==0 && j==0){
            
        }
        if(s[i][j].contains("R")){
            c++;
            k=0;
            s[i][j].replace('R', ' ');
            trace(i,j+1);
        }
        else if(s[i][j].contains("B")){
            c++;
            k=0;
            s[i][j].replace('B', ' ');
            trace(i+1,j);
        }
        else if(s[i][j].contains("L")){
            c++;
            k=0;
            trace(i,j-1);
            s[i][j].replace('L', ' ');
        }
        else if(s[i][j].contains("U")){
            c++;
            k=0;
            s[i][j].replace('U', ' ');
            trace(i-1,j);
        }
        return c;
    }
}
