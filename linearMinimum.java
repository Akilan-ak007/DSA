package searching;

public class linearMinimum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,-6};
        System.out.println(Min(arr));
    }
    static int Min(int[] arr) {
        int ans = arr.length;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
