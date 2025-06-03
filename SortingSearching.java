import java.util.Arrays;

public class SortingSearching {
    public static void main(String[] args) {
        int[] numbers = { 5, 2, 8, 1 };
        Arrays.sort(numbers); // [1, 2, 5, 8]
        int index = Arrays.binarySearch(numbers, 5); // index = 2
    }
}
