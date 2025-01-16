package UI.Coding;

public class HomWork {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {5, 11, 9};
        int[] nums3 = {7, 0, 0};


        printArray(rotateLeft3(nums1));
        printArray(rotateLeft3(nums2));
        printArray(rotateLeft3(nums3));
    }

    public static int[] rotateLeft3(int[] nums) {

        return new int[]{nums[1], nums[2], nums[0]};
    }


    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
