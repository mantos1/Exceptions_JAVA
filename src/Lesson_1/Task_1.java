package Lesson_1;

import java.util.ArrayList;

public class Task_1 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array2 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Разница: " + differenceArray(array1, array2));
    }

    public static ArrayList<Integer> differenceArray(int[] a1, int[] a2) {
        ArrayList<Integer> res = new ArrayList<>();
        int min = Math.min(a1.length, a2.length);
        int max = Math.max(a1.length, a2.length);
        if (min < 1) {
            throw new RuntimeException("Один из массивов пуст");
        }
        if (min < max) {
            throw new RuntimeException("Длинны массивов не равны!");
        }
        for (int i = 0; i < min; i++) {
            res.add(a1[i] - a2[i]);
        }
        return res;
    }
}
