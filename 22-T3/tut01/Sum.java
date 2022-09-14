package example;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        
        String[] nums = line.split(" ");
        
        int sum = 0;
        for (String num : nums) {
            sum += Integer.parseInt(num);
        }
                
        System.out.println(sum);
        
        scanner.close();
    }
}
