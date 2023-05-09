package Lesson_2;

import java.io.FileNotFoundException;

public class Task_3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            if (b != 0) {
                System.out.println(a / b);
            }
            printSum(23, 234);
            int[] abc = {1, 2};
            int index = 3;
            if (index >= 0 && index < abc.length) {
                abc[index] = 9;
            }
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }
}