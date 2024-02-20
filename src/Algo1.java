import java.util.Arrays;

void main(){
    int[] nums = {10,20};
    System.out.println(Arrays.toString(nums));
    int[] reversedNums = reverseArray(nums);
    System.out.println(Arrays.toString(reversedNums));
    System.out.println(Arrays.toString(reverseArray(new int[]{1,2,3,4,5})));
}

int[] reverseArray(int[] nums){
    int[] reversedNums = new int[nums.length];

    for (int i = 0; i < reversedNums.length; i++) {
        //reversedNums[0] = nums[4]; // i=0 => 5 - 1 - i = 4
        //reversedNums[1] = nums[3]; // i=1 => 5 - 1 - i = 3
        reversedNums[i] = nums[nums.length - 1 - i];
    }
    return reversedNums;
}