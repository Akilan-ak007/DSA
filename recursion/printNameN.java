package recursion;

public class printNameN {
    static void fun(int n,int  m){
        if(n>m){
            return;
        }
        System.out.println("akilan");
        fun(n+1,m);
    }
    public static void main(String[] args) {
        fun(1,3);
    }
}
