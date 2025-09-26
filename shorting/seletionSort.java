package shorting;
  
public class seletionSort {
    static void sort(int arr[], int n){
        for(int i = 0;i < n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i]=temp;
            
        }
                System.out.println("after seletion sort:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]= {13,46,24,52,20,9};
        int n = arr.length;
        System.out.println("befour seletion sort:" + " ");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        sort(arr,n);
    }
}
    
/* 
 //This is the methode to put in takeuforward and leetcode

public int[] selectionSort(int[] nums) {

         int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[min]) {   
                    min = j;
                }
            }
            // swap
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }

        return nums; // return the sorted array
    }
}
*/