   package recursion;

import java.util.Arrays;

public class margeShortImPlace {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        mrg(arr , 0 , arr.length);
        System.out.println(Arrays.toString(arr));

    }
    static  void  mrg(int[] arr,int s , int e ){
        if(e - s==1){
           return;
        }
        //to divide the arr in to two ;
        int mid = ( s + e )/2;

        //(Arrays.copyOfRange(arr,0,mid);! this is usedf for take a copy of ther arr to divi the arr into left and right;
        mrg(arr,s,mid);
        mrg(arr,mid,e);

        merge(arr,s,mid,e);
  
        }
        static void  merge(int[] arr , int  s , int m , int e){
            //this willl add the lift and right array in one of mix;
            int[] mix = new int[e - s];

            int i = s;
            int j = m;
            int k = 0;
           //on the while statement when i is lessthen the length of first and secound if condition will come 
            while(i< m && j< e ){
                //on if condition the first[i] is lessthen secound[j] . the first[i] will store in mix[k]
                if(arr[i] < arr[j]){ 
                    mix[k] = arr[i];
                    i++;
                }
                else{
                    //when the if is not satiesfide secound[j] will store in mix[k]:
                    mix[k] = arr[j];
                    j++;
                }
                k++;
            }
            while( i < m ){ 
                mix[k] = arr[i];
                i++;
                k++;
            }
             while( j < e ){
                mix[k] = arr[j];
                j++;
                k++;
            }
           for(k=0;k < mix.length;k++){
                arr[s+k] = mix[k];
            }

        }
}

