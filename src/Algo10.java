import java.util.Arrays;

void main() {
    int[] nums = {6, 4, 9, 5, -2, 7, 0};
//    int[] nums = {5, 4, 3, 2, 1, 0, -1};
    System.out.println(Arrays.toString(nums));
    insertionSort(nums);
    System.out.println(Arrays.toString(nums));
}

void insertionSort(int[] nums) {
    for (int k = 0; k < nums.length - 1; k++) {
        // Selection
        int value = nums[k + 1];
        // Optimization Logic
        if (value > nums[k]) continue;

        int insertionIndex = k;         // ?
        boolean shift = false;
        for (int i = 0; i < (k + 1); i++) {
            // Search
            if (nums[i] > value && !shift) {
                insertionIndex = i;
                shift = true;
            }
            // Shift
            if (shift) {
                nums[(k + 1) - (i - insertionIndex)] = nums[(k + 1) - ((i - insertionIndex)) - 1];
            }
        }
        // Replace
        nums[insertionIndex] = value;
        return;
    }
}