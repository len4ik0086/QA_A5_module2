package Module_2;

//Написати код для вибірки всіх значень з List<Integer>,
//які > 100 та повернути новий список з цими значеннями, але у вигляді List<String>

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ListString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integers = new ArrayList<>();
        System.out.println("Введіть цілі числа (для завершення введення введіть крапку): ");
        while (scanner.hasNextInt()) {
            integers.add(scanner.nextInt());
        }

        List<String> filteredStrings = filterValues(integers);
        System.out.println("Числа більше 100: " + filteredStrings);
    }

    public static List<String> filterValues(List<Integer> integers) {
        List<String> filteredStrings = new ArrayList<>();
        for (Integer num : integers) {
            if (num > 100) {
                filteredStrings.add(String.valueOf(num));
            }
        }
        return filteredStrings;
    }

}

