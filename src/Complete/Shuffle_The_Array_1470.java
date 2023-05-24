package Complete;

import java.util.Arrays;

public class Shuffle_The_Array_1470 {
    public static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[n * 2];
        int temp = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            arr[i] = nums[temp];
            temp++;
        }
        for (int i = 1; i < nums.length; i = i + 2) {
            arr[i] = nums[n];
            n++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        //[2,3,5,4,1,7]

        System.out.println(Arrays.toString(shuffle(nums, 3)));
    }
}
