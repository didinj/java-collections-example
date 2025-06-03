import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncListExample {
    public static void main(String[] args) {
        List<String> syncList = Collections.synchronizedList(new ArrayList<>());

        synchronized (syncList) {
            syncList.add("Thread-safe item");
        }
    }
}
