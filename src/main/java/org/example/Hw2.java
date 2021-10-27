package org.example;

public class Hw2 {

    public static void main(String[] args){
        //Calculate();
        //isPositiveOrNegataive();
        //isNegative();
        //printWordNTimes();
        //leapYear();
    }
    public static void Calculate(){
        int a = 4;
        int b = 6;
        int c = a + b;
        if (c >=10 && c <= 20){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    } public static void isPositiveOrNegataive(){
        int integer = 0;
        if (integer >= 0) {
            System.out.println("Переменная положительная");
        } else {
            System.out.println("Переменная отрицательная");
        }
    } public static void isNegative(){
        int d = 1;
        if (d >= 0) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    } public static void printWordNTimes(){
      int i = 0;
        for ( i = 0; i < 10;i++){
          System.out.printf("Hello #%d:",i);
      for (int j = 0;j<11;j++){
          System.out.print(j + " ");
      }
            System.out.println();
      }
      } public static boolean leapYear() {
        int year = 4;
        if (year % 4 == 0) {
            return true;
        } else if (year == 100) {
            return false;
        } else {
            return false;
        }
    }
}