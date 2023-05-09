package Lesson_2;

import java.util.Scanner;
public class Task_4 {

    public static void main(String[] args) {
        System.out.print("Введите данные: ");
        Scanner scan = new Scanner(System.in);
        String data = scan.nextLine();
        if (!data.isEmpty()){
            System.out.println("Вы ввели: " + data);
        } else {
            throw new RuntimeException("Вы не ввели никаких данных");
        }
    }
}

