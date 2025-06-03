import java.util.Collections;
import java.util.List;

public class UnmodifiedListExample {
    public static void main(String[] args) {
        List<String> readOnlyList = Collections.unmodifiableList(names);
        // readOnlyList.add("David"); // Throws UnsupportedOperationException
    }
}
