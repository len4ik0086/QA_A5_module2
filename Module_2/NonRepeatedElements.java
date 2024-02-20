package Module_2;

//Знайти кількість елементів масиву, що не повторюються.
//Приклад: для 1 4 5 1 1 3 ответ 3 (числа 4, 5, 3).
//*Створити метод, що приймає масив та повертає число, результат.

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class NonRepeatedElements {

    public static void main(String[] args) {
        int[] array = new int[10];
        fillArray(array);
        System.out.println("Оригінальний масив: " + Arrays.toString(array));
        int count = countNonRepeatedElements(array);
        System.out.println("Кількість елементів, які неповторюються: " + count);
    }

    public static int[] fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 11);
        }
        return array;
    }

    public static int countNonRepeatedElements(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            boolean repeated = false;
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    repeated = true;
                    break;
                }
            }
            if (!repeated) {
                count++;
            }
        }
        return count;
    }

}
