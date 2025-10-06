package searching;

import java.util.Arrays;

public class linear2DArrays {

    public static void main(String[] args) {
        int[][] arr = {
                {24, 1, 33},
                {323, 34},
                {78, 81, 94, 73},
                {533, 85, 45, 51, 14}
        };

        int target = 533;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1}; // if target not found
    }
}
