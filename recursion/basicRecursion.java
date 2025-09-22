package recursion;

public class basicRecursion {
    // static void fun(){
    //     System.out.println("1");
    //     fun();
    // }
    static void fun(int count){
        
        if(count==3){
            System.out.println(count);
            return;
        }
    //    System.out.println(count);
        fun(count+1);
    }
    public static void main(String[] args) {

       fun(0);
    }
    
}
