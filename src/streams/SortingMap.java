package streams;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingMap {

    public static void sortMap(Map<String,Integer> mp){
        System.out.println("Before Sorting:" + mp.toString());
        Map<String,Integer> sorted = mp.entrySet().stream().
                                        sorted(Comparator.comparing(m -> m.getValue())).
                                        collect(Collectors.toMap(
                                            entry -> entry.getKey(),
                                            entry -> entry.getValue(),
                                            (a,b) -> a,
                                            () -> new LinkedHashMap<>()
                                        ));
        System.out.println("After sorting: " + sorted.toString());
    }
    
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Rupinder", 1);
        map.put("Jeevika", 5);
        map.put("Simba", 2);
        sortMap(map);
    }
}
