import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GroupingStudentGrade {
    public static void main(String[] args) {
        Map<String, Set<String>> gradeMap = new HashMap<>();
        gradeMap.put("Grade A", new HashSet<>(Set.of("Alice", "Bob")));
        gradeMap.get("Grade A").add("Charlie");

        System.out.println(gradeMap);
    }
}
