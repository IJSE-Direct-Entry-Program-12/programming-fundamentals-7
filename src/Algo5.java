import java.util.Arrays;

void main() {
    int[] nums = {10, 20, 30, 40, 50};
    System.out.println(Arrays.toString(nums));
    reverseArray(nums);
    System.out.println(Arrays.toString(nums));
}

void reverseArray(int[] nums) {
//    int[] temp = new int[nums.length];
//    for (int i = 0; i < temp.length; i++) temp[i] = nums[nums.length - 1 - i];
//    for (int i = 0; i < nums.length; i++) nums[i] = temp[i];
    for (int i = 0; i < nums.length / 2; i++) {
        int temp = nums[i];
        nums[i] = nums[nums.length - 1 - i];
        nums[nums.length - 1 - i] = temp;
    }
}
