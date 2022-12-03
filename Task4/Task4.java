/*
 * Написать метод, которому в качестве параметра передается целое число.
 * Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
 */
package Task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите целое число: ");
        int number = Integer.parseInt(iScanner.nextLine());
        iScanner.close();
        boolean result = checkPositiveOrNot(number);
        System.out.println(result);
    }

    static boolean checkPositiveOrNot(int n) {
        if (n < 0) {
            return true;
        } else {
            return false;
        }
    }
}
