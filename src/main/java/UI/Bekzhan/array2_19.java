package UI.Bekzhan;

public class array2_19 {
    public class ConsecutiveEvenOdd {
    public static boolean hasThreeConsecutiveEvenOrOdd(int[] arr) {
        // Loop through the array, checking for three consecutive even or odd numbers
        for (int i = 0; i < arr.length - 2; i++) {
            // Check if the current and next two numbers are all even or all odd
            if ((arr[i] % 2 == arr[i + 1] % 2) && (arr[i + 1] % 2 == arr[i + 2] % 2)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 1, 3, 5};
        System.out.println(hasThreeConsecutiveEvenOrOdd(arr)); // Should print true
    }
}
}
