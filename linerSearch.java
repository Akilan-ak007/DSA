package searching;

public class linerSearch {
    public static void main(String[] args) {
        int[] nums = {12, 34, 65, 78, 67634, 23, 654, 67, 5, 324123, 32};
        int target = 654;
        int ans = search(nums, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }

        }
        return -1;
}
}

