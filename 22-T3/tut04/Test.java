import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // forEach 
        List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
        for (String str : strings) {
            System.out.println(str);
        }
        
        // Without brackets
        strings.stream().forEach(str -> System.out.println(str));
        
        // With brackets
        strings.stream().forEach(str -> {
            System.out.println(str);
        });
        
        // Using scope operator
        strings.stream().forEach(System.out::println);
        
        
        // Filter
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
        for (int num : nums) {
            // Print even
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
        
        nums.stream().filter(num -> num % 2 == 0).forEach(System.out::println);
        
        nums.stream().filter(num -> {
            return num % 2 == 0;
        }).forEach(System.out::println);
        
        // Collecting the results into a list
        List<Integer> nums2 = nums.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        nums2.stream().forEach(System.out::println);
        
        // Map
        List<Integer> nums3 = nums.stream().map(num -> num * 2).collect(Collectors.toList());
        nums3.stream().forEach(System.out::println);
        
        // Reduce
        int sum = nums.stream().reduce(0, (n1, n2) -> n1 + n2);
        System.out.println(sum);
        
    }
}
