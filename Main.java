import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] array = {"Sveta", "Veter", "Sveta", "Sveta"};
        Map<String, Integer> map = countByElements(array);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }

    public static <K> Map<K, Integer> countByElements(K[] array) {
        Map<K, Integer> map = new HashMap<>();
        for (K k : array) {
            map.compute(k, (k1, count) -> count == null ? 1 : count + 1);
        }
        return map;
    }
}