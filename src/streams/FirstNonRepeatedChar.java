package streams;

public class FirstNonRepeatedChar {

    public static void findFirstNonRepeatedChar(String str){
        // str.chars().
        // mapToObj(c -> (char)c).
        // collect(Collectors.groupingBy(
        //     ch -> ch,
        //     () -> new LinkedHashMap<>(),
        //     Collectors.counting()
        // )).
        // entrySet().
        // stream().
        // filter(m -> m.getValue() == 1).
        // map(m -> m.getKey()).findFirst().ifPresentOrElse(
        //     c -> System.out.println(c), 
        //     () -> System.out.println("not found"));

        str.chars().
        mapToObj(c -> (char)c).
        filter(c -> str.indexOf(c) == str.lastIndexOf(c)).
        findFirst().ifPresentOrElse(
            c -> System.out.println(c), 
            () -> System.out.println("not found")
        );
    }

    public static void main(String[] args) {
        String str = "swiss";
        findFirstNonRepeatedChar(str);
    }
}
