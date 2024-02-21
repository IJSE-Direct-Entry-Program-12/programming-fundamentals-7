import java.util.Scanner;

void main() {
    int[] nums = {50, 20, 3, -2, 7, 8};
    final var SCANNER = new Scanner(System.in);

    outer:
    do {
        System.out.print("Enter a number to search: ");
        int input = SCANNER.nextInt();

        /* This is called linear search algorithm */
        /* This is usually used with low capacity data structures */
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] == input){
                System.out.println(STR."Found at: \{i}");
                continue outer;
            }
        }

        System.out.println("Not found");

    }while(true);

}