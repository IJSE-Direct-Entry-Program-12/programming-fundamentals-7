import java.util.Arrays;

void main() {
    int[] nums1 = {3, 2, 5, -3, 0, 1};
    int[] nums2 = {3, 2, 5, -3, 10, 8};
    System.out.println(Arrays.toString(nums1));
    selectionSortViaMin(nums1);
    System.out.println(Arrays.toString(nums1));
//    System.out.println("---------------------");
//    System.out.println(Arrays.toString(nums2));
//    selectionSortViaMax(nums2);
//    System.out.println(Arrays.toString(nums2));
}

void selectionSortViaMin(int[] nums) {
    for (int k = 0; k < nums.length; k++) {
        int minIndex = k;
        int min = nums[minIndex];
        for (int i = k + 1; i < nums.length; i++) {
            if (nums[i] < min){
                minIndex = i;
                min = nums[minIndex];
            }
        }
        if (k == minIndex) continue;
        int temp = nums[k];
        nums[k] = min;
        nums[minIndex] = temp;
    }
}

void selectionSortViaMax(int[] nums) {
//    for (int k = nums.length - 1; k >=0; k--) {
//        int minIndex = k;
//        int max = nums[minIndex];
//        for (int i = (k - 1); i >= 0 ; i--) {
//            if (nums[i] > max){
//                minIndex = i;
//                max = nums[i];
//            }
//        }
//        if (minIndex == k) continue;
//        int temp = nums[k];
//        nums[k] = max;
//        nums[minIndex] = temp;
//    }
}