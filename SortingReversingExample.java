import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingReversingExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Charlie", "Alice", "Bob"));
        Collections.sort(names);
        System.out.println(names); // [Alice, Bob, Charlie]

        Collections.reverse(names);
        System.out.println(names); // [Charlie, Bob, Alice]
    }
}
