import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class App {
    public static void main(String[] args) {
        // List<String> strings = new ArrayList<String>(Arrays.asList(new String[] {"1", "2", "3", "4", "5"}));
        // for (String string : strings) {
        //    System.out.println(string);
        // }
        
        // strings.stream().forEach(str -> {
        //     System.out.println(str);
        // });
        
        // strings.stream().forEach(str -> System.out.println(str));
        
        // strings.stream().forEach(System.out::println);
        // // strings.stream().forEach(System.out.println);
        
        
        List<String> strings2 = new ArrayList<String>(Arrays.asList(new String[] {"1", "2", "3", "4", "5"}));
        List<Integer> ints = new ArrayList<Integer>();
        for (String string : strings2) {
            ints.add(Integer.parseInt(string));
        }
                
        List<Integer> list2 = strings2.stream().map(x -> Integer.parseInt(x)).collect(Collectors.toList());
        
        List<Integer> list = strings2.stream()
                                            .map(Integer::parseInt)
                                            .collect(Collectors.toList());
        
        list2.stream().forEach(System.out::println);
        list.stream().forEach(System.out::println);
        
    }
}