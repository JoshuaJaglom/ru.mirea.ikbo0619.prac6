package com.company;
import java.util.Scanner;
import java.util.*;
public class QuickSort {

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        int opora = array[middle];
        int i = low, j = high;
        while (i <= j) {
            while (array[i] > opora) {
                i++;
            }

            while (array[j] < opora) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
    public static void main(String[] args) {
        Map m1 = new HashMap();
        System.out.println("Введите количество студентов");
        Scanner sc1 = new Scanner(System.in);
        int size = sc1.nextInt();
        int num = 0;
        int x[] = new int[size];
        while (size!=num)
        {
            System.out.println("Введите имя студента");
            Scanner sc = new Scanner(System.in);
            String name = sc.next();
            System.out.println("Введите баллы студента");
            Scanner sc2 = new Scanner(System.in);
            int score = sc.nextInt();
            x[num] = score;
            m1.put(score, name);
            num++;
        }
        List listA = new ArrayList();
        int low = 0;
        int high = x.length - 1;
        quickSort(x, low, high);
        for (int i = 0; i < size; i++)
        {
            listA.add(m1.get(x[i]));
        }
        for (int i = 0; i < size; i++)
        {
            System.out.println("Имя студента: " + listA.get(i) + ". Количество баллов: " + x[i]);
        }

    }
}