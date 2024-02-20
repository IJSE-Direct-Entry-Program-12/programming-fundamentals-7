import java.util.Arrays;

void main() {
    printDigits(125);   // [1,2,5]
    printDigits(8255);  // [8,2,5,5]
    printDigits(10);    // [1,0]
}

//void printDigits(int number){       // with String API
//    System.out.println(Arrays.toString(String.valueOf(number).toCharArray()));
//}

//void printDigits(int number){       // without String API (Reverse Order)
//// if the number is 125 then
////    System.out.println(number % 10); // 5
////    System.out.println(number / 10 % 10); // 2
////    System.out.println(number / 100 % 10); // 1
//    System.out.print("[");
//    while (number != 0){
//        System.out.print(STR."\{number % 10}, ");
//        number /= 10;
//    }
//    System.out.println("\b\b]");
//}

void printDigits(int number) {       // without String API
    int power = 1;
    int count = 0;
    while ((number / (power *= 10)) != 0) count++;
    power /= 10;
    System.out.print("[");
    while (count-- >= 0) {
        System.out.print(STR."\{number / power}, ");
        number %= power;
        power /= 10;
    }
    System.out.println("\b\b]");
}