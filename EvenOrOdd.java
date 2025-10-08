package maths_combinations;

public class EvenOrOdd {

        public static boolean isEven(int n)
        {
            // finding remainder of n
            int rem = n % 2;
            if(rem == 0){
                return true;
            }
            else{
                return false;
            }
        }

        // Driver Code
//        public static void main(String[] args)
//        {
//            int n = 15;
//            if (isEven(n) == true)
//                System.out.print("true");
//            else
//                System.out.print("false");
//        }


    // this code is using bit of AND it contains 0001 link that so for so
    //let's take n as 15(bit will be 1111) & is AND bit of 1 (AND 1 bit will be 0001) so it is != so 15 is even:
    public static boolean isEvens(int n)
    {
        // taking bitwise and of n with 1
        if ((n & 1) == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        int n = 15;
        if (isEven(n) == true)
            System.out.print("true");
        else
            System.out.print("false");
    }
}
