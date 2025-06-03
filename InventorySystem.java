import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventorySystem {
    public static void main(String[] args) {
        Map<String, List<String>> inventory = new HashMap<>();
        inventory.put("Fruits", new ArrayList<>(List.of("Apple", "Banana")));
        inventory.put("Vegetables", new ArrayList<>(List.of("Carrot", "Lettuce")));

        inventory.get("Fruits").add("Orange");
        System.out.println(inventory);
    }
}
