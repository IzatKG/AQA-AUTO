package UI.apsamat1;

public class Arrays {
    public static void main(String[] args) {
        System.out.println(firstLast6(new int[]{1, 2, 6}));
        System.out.println(firstLast6(new int[]{6, 1, 2, 3}));
        System.out.println(firstLast6(new int[]{13, 6, 1, 2, 3}));
    }

    public static boolean firstLast6(int[] nums) {

        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }
}
