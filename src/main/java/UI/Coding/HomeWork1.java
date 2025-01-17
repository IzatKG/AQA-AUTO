package UI.Coding;

public class HomeWork1 {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3};
        int[] nums3 = {};
        int[] nums4 = {7};


        System.out.println(sameFirstLast(nums1));
        System.out.println(sameFirstLast(nums2));
        System.out.println(sameFirstLast(nums3));
        System.out.println(sameFirstLast(nums4));
    }

    public static boolean sameFirstLast(int[] nums) {

        return nums.length > 0 && nums[0] == nums[nums.length - 1];
    }
    }

