import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncronizingCollection {
    public static void main(String[] args) {
        List<String> syncList = Collections.synchronizedList(new ArrayList<>());
    }
}
