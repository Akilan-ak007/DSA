package KKrecursion;

    public class recursion {
    public static void main(String[] args) {
        numbner(1);
        //first main is called and then main will go to number funtion
        //And then number on funtion will print the 1 and then that funtion calls the number 2 that function print 2 :
        //like that the funtion cakll upoto 5 nnumber :
    }
   static void numbner(int n){
         System.out.println(n);
         numbner1(2);
     }
    static void numbner1(int n){
        System.out.println(n);
        numbner2(3);
    }
    static void numbner2(int n){
        System.out.println(n);
        numbner3(4);
    }
    static void numbner3(int n){
        System.out.println(n);
        numbner4(5);
    }
    static void numbner4(int n) {
        System.out.println(n);
    }
}
