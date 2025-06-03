import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(3); // Ignored
        System.out.println(numbers); // [1, 3]
    }
}
