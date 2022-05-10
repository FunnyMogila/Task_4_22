package vsu.cs.soshich;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int n = scanner.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++)
        {
            System.out.println("Введите " + (i+1) + " строку");
            s[i] = scanner1.nextLine();
        }
        Rachestka.comb(s);
        System.out.println("Результат работы сортировки расчесткой");
        for (int i = 0; i < n; i++)
        {
            System.out.println(s[i]);
        }
    }
}
