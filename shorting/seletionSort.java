package shorting;
 
public class seletionSort {
    static void sort(int arr[], int n){
        for(int i = 0;i < n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[min]){
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
public class SelectionSort {
    public static void selectionSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Find the index of the minimum element
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};

        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        selectionSort(arr);

        System.out.println("\n\nSorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }    
    }
}
    */
