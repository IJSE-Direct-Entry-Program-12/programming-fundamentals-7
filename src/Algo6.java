import java.util.Arrays;

void main() {
    printLongestStraightLine(new int[]{2, 2},
            new int[]{1, 1}, new int[]{2, 1}, new int[]{3, 3}, new int[]{4, 4}, new int[]{1, 3});
    System.out.println();
    printLongestStraightLine(new int[]{0, 0},
            new int[]{1, 3}, new int[]{1, 2}, new int[]{2, 4}, new int[]{2, 2},
            new int[]{3, 1}, new int[]{4, 0});
    System.out.println();
    printLongestStraightLine(new int[]{1, 1},
            new int[]{3, 2}, new int[]{5, 3}, new int[]{4, 1}, new int[]{2, 3},
            new int[]{1, 4}, new int[]{0, 0});
}

void printLongestStraightLine(int[]... coordinatePairs) {

}

