import java.util.Scanner;

void main() {
    int[] nums = {5, 4, -3, 0, 7, 2, 1};
    final var SCANNER = new Scanner(System.in);
    sort(nums);

    do {
        System.out.print("Enter a number to search: ");
        int input = SCANNER.nextInt();
        int foundAt = binarySearch(nums, 0, nums.length - 1, input);
        if (foundAt != -1) System.out.println(STR."Found at: \{foundAt}");
        else System.out.println("Not Found");
    } while (true);
}

int binarySearch(int[] nums, int head, int tail, int target) {
    if (head > tail) return -1;
    if (nums[head] == target) return head;
    if (nums[tail] == target) return tail;
    int middle = (head + tail) / 2;
    if (nums[middle] == target) return middle;
    if (nums[middle] > target){
        return binarySearch(nums, head + 1, middle - 1, target);
    }else{
        return binarySearch(nums, middle + 1, tail - 1, target);
    }
}

void sort(int[] nums) {
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