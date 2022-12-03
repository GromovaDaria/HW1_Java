
/*Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. 
С помощью цикла и условия заменить 0 на 1, 1 на 0; */

package Task7;

import java.util.Arrays;

public class task7 {
    public static void main(String[] args) {
        int[] array = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println("Изначальный массив: " + Arrays.toString(array));
        newArray(array);
    }

    static void newArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println("Измененный массив: " + Arrays.toString(arr));
    }
}
