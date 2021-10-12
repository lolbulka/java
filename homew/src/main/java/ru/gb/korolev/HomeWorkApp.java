package ru.gb.korolev;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("-------------------");
        printThreeWords();
        System.out.println("-------------------");
        checkSumSign();
        System.out.println("-------------------");
        printColor();
        System.out.println("-------------------");
        compareNumbers();
        System.out.println("-------------------");



    }
    public static void printThreeWords(){
        System.out.println("Orange\nBanana\nApple");
    }
    public static void checkSumSign(){
        int a = 10, b = -11;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor(){
        int value = 100;
        if (value <= 0){
            System.out.println("Красный");
        } else if (value <= 100){
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(){
        int a = 21, b = 22;
        System.out.println(a >= b ? "a >= b" : "a < b");

    }
}
