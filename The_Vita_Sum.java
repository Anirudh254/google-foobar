public class The_Vita_Sum {
    static int fact(int n){
        int s=1;
        while(n>0){
            s*=n;
            n--;
        }
        return s;
    }
    static int combination(int a, int b){
        return fact(a)/(fact(b)*fact(a-b));
    }
    public static void main(String[] args){
        int N=8,K=3,c=0;
        
        for(int i=0;i<=K;i++){
            if(i%2==0){
                c+=combination(N,i);
            }
        }
        System.out.println(c);
    }
}