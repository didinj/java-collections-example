import java.util.concurrent.ConcurrentMap;

public class ConcurrentHashMap {
    public static void main(String[] args) {
        ConcurrentMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        System.out.println(map.get("A")); // 1

    }
}
