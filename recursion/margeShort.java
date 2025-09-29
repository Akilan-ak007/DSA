package recursion;

import java.util.Arrays;

public class margeShort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        arr=mrg(arr);
        System.out.println(Arrays.toString(arr));

    }
    static  int[] mrg(int[] arr){
        if(arr.length==1){
           return arr;
        }
        //to divide the arr in to two ;
        int mid = arr.length/2;

        //(Arrays.copyOfRange(arr,0,mid);! this is usedf for take a copy of ther arr to divi the arr into left and right;
        int[] left = mrg(Arrays.copyOfRange(arr,0,mid));
        int[] right = mrg(Arrays.copyOfRange(arr,mid,arr.length));

        return  merge(left,right);
 
        }
        private static int[] merge(int[] first , int[] secound){
            //this willl add the lift and right array in one of mix;
            int[] mix = new int[first.length+secound.length];

            int i = 0;
            int j = 0;
            int k = 0;
           //on the while statement when i is lessthen the length of first and secound if condition will come 
            while(i<first.length && j<secound.length){
                //on if condition the first[i] is lessthen secound[j] . the first[i] will store in mix[k]
                if(first[i] < secound[j]){ 
                    mix[k] = first[i];
                    i++;
                }
                else{
                    //when the if is not satiesfide secound[j] will store in mix[k]:
                    mix[k] = secound[j];
                    j++;
                }
                k++;
            }
            while(i<first.length){
                mix[k] = first[i];
                i++;
                k++;
            }
             while(j<secound.length){
                mix[k] = secound[j];
                j++;
                k++;
            }
            return mix;

        }
}
