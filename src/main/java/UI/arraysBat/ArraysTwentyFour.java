package UI.arraysBat;

public class ArraysTwentyFour {
    public static void main(String[] args) {
        System.out.println(Meder(new int[]{4,5}));
        System.out.println(Meder(new int[]{4,2}));
        System.out.println(Meder(new int[]{3,5}));
    }

    public static boolean Meder(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 || nums[i] == 3) {
                return false;
            }

        }
        return true;
    }
}
