/*
Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку,
указанное количество раз; */

package Task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Напишите что-нибудь: ");
        String str = iScanner.nextLine();
        System.out.printf("Укажите, сколько раз это предложение необходимо повторить: ");
        int count = Integer.parseInt(iScanner.nextLine());
        iScanner.close();
        lineDuplication(str, count);
    }

    static void lineDuplication(String str, int c) {
        for (int i = 0; i < c; i++) {
            System.out.printf("%s\n", str);
        }
    }
}
