
import java.util.HashMap;

public class HashMapCode1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Dev", 25);
        map.put("Divya", 30);
        map.put("Ritik", 35);

        System.out.println("Initial Map: " + map);

        System.out.println("Dev's age: " + map.get("Dev"));

        map.put("Divya", 32);
        System.out.println("Updated Map: " + map);

        map.remove("Ritik");
        System.out.println("After Removing Ritik: " + map);

        System.out.println("Map Size: " + map.size());
    }
}
