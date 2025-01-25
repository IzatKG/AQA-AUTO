package UI.array.joldosh;

public class CodingBat {
    public static int[] rotateLeft3(int[] nums) {

        return new int[]{nums[1], nums[2], nums[0]};
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        int[] result = rotateLeft3(nums);

        System.out.print("Result:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}