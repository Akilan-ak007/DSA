package searching;

public class linearRange {
    public static void main(String[] args) {
        int[] arr = {12,44,464,33,46,42,53,34};
        int target = 464;
        System.out.println(search(arr,target,1,4));
    }
    static int search(int[] arr, int target,int start,int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }

        }
        return -1;
    }
}
