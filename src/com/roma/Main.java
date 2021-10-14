package com.roma;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;
        Scanner mass = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int a[] = new int[mass.nextInt()];
        System.out.println("Введите числа в массив");
        for (int i = 0; i < a.length ; i++) {
            System.out.println("Введите элемент " + (i + 1));
            a[i] = mass.nextInt();
        }
        for (int i : a) {
            if (i == x || i == y || i == z)
                System.out.println("Данное значение имеется в константах " + i);
        }


    }
}
