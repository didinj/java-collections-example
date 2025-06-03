import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRoles {
    public static void main(String[] args) {
        Map<String, List<String>> userRoles = new HashMap<>();
        userRoles.put("alice", List.of("ADMIN", "EDITOR"));
        userRoles.put("bob", List.of("VIEWER"));

        System.out.println(userRoles.get("alice")); // [ADMIN, EDITOR]
    }
}
