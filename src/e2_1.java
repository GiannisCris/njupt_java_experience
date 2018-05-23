public class e2_1 {
    public static boolean IsPlalindrome(int n){
        int i=n ;
        int m=0 ;
        while(i != 0)
        {
            m=m*10+i%10;
            i=i/10   ;
        }
        return ( m == n );
    }
    public static void main(String[] args){
        int i;
        for (i=11;i<1000;i++){
            if (IsPlalindrome(i)&&IsPlalindrome(i*i)&&IsPlalindrome(i*i*i)){
                System.out.println(i);
            }
        }
    }
}
