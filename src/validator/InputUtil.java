package validator;

import java.util.Scanner;

public class InputUtil {
    public static String inputString(String input) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.printf("%s", input);
            String inputName = sc.nextLine();
            if (inputName.isEmpty()||inputName.isBlank()) {
                continue;
            }
            return inputName;
        }
    }
}
