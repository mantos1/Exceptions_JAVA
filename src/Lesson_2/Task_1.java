package Lesson_2;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean user = true;

        while (user==true){
            System.out.print("Введите дробное число: ");
            String num = sc.nextLine();
            try {
                Float floatNum = Float.parseFloat(num);
                user = false;
                System.out.println("Ваше число: " + floatNum);
            } catch (NumberFormatException e) {
                System.out.println("Введено не дробное число! \n Повторите ввод:");
            }
        }
    }
}
