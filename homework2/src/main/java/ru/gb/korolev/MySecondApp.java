package ru.gb.korolev;

import java.util.Random;

public class MySecondApp {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println((compareRange(random.nextInt(20), random.nextInt(20)) ? " " : " не ")
                + "входит в диапазон от 10 до 20 включительно.");
        System.out.println("---------------------------------------------------------");
        checkNumber(random.nextInt(10) * (random.nextInt(5) - random.nextInt(10)));
        System.out.println("---------------------------------------------------------");
        System.out.println(isNumberlessZero(random.nextInt(10) * (random.nextInt(5) -
                random.nextInt(10))) ? "Правда." : "Ложь");
        System.out.println("---------------------------------------------------------");
        printString("Java это круто", 5);
        System.out.println("---------------------------------------------------------");
        System.out.println((isLeapYear(1994) ? "" : "не ") + "високосным.");

    }
    public static boolean compareRange(int firstNumber, int secondNumber){
        System.out.print("Сумма чисел " + firstNumber + " и " + secondNumber);
        return firstNumber + secondNumber >= 10 && firstNumber + secondNumber <= 20;
    }
    public static void checkNumber(int number){
        System.out.println("Число " + number + (number >= 0 ? " положительное." : " отрицательное."));
    }
    public static boolean isNumberlessZero(int number){ //возвращаем true, если входной параметр меньше 0
        System.out.print("Число " + number + " меньше 0? ");
        return number < 0;
    }
    public static void printString(String str, int number){
        for (int i = 0; i < number; i++) {
            System.out.println(str);
        }
    }
    public static boolean isLeapYear(int number){ //number = год
        System.out.print("Год " + number + " является ");
        return number % 4 == 0 && (number % 100 != 0 || number % 400 == 0);
    }
}
