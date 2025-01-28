package UI.arraysBat;

import java.util.Arrays;

public class ArrayMakeLast {
    public int[] makeLast(int[] nums) {

        int[] result = new int[nums.length * 2];

        result[result.length - 1] = nums[nums.length - 1];
        return result;
    }

    public static void main(String[] args) {
        ArrayMakeLast solution = new ArrayMakeLast();

        System.out.println(Arrays.toString(solution.makeLast(new int[]{4, 5, 6})));
        System.out.println(Arrays.toString(solution.makeLast(new int[]{1, 2})));
        System.out.println(Arrays.toString(solution.makeLast(new int[]{3})));
    }
}