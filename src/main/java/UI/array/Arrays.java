package UI.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Arrays {
    public static int[] makeLast(int[] nums) {
        int[] num = new int[2 * nums.length];
        num[num.length - 1] = nums[nums.length - 1];
        return num;
    }

    @Test
    @DisplayName("Make Last")
    public void makeLast() {

        int[] numm = {4, 5, 6};
        int[] result = makeLast(numm);
        System.out.println("Result: ");
        for (int n : result) {
            System.out.println(n + " ");
        }
    }

}
