import java.util.Arrays;

void main() {
    int[] nums1 = {5, 4, 3, 2, 1, 0, -1};
    int[] nums2 = {5, -1, 3, -2, 0, 8, 4};
    System.out.println(Arrays.toString(nums1));
    bubbleSortViaMax(nums1);
    System.out.println(Arrays.toString(nums1));
//    System.out.println("---------------------");
//    System.out.println(Arrays.toString(nums2));
//    bubbleSortViaMin(nums2);
//    System.out.println(Arrays.toString(nums2));
}

void bubbleSortViaMax(int[] nums) {
    for (int k = 0; k < nums.length - 1; k++) {
        for (int i = 0; i < nums.length - 1 - k; i++) {
            if (nums[i] > nums[i + 1]) {
                int temp = nums[i + 1];
                nums[i + 1] = nums[i];
                nums[i] = temp;
            }
        }
    }
}

void bubbleSortViaMin(int[] nums) {

}

