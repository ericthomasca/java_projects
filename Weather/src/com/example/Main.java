package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number between 1 and 8: ");
        int integerEntry = input.nextInt();

        for (int i=1; i<9; i++){
            System.out.print(integerEntry + "\t");
        }
        System.out.println();
        for (int i=1; i<9; i++){
            System.out.printf("%-8d",integerEntry);
        }
        System.out.println();
        System.out.println("\"The path to the file is C:\\usr\\local\\bin\"");

        //print today's weather
        Weather weatherStatus = new Weather();
        weatherStatus.todayWeather();

        int studentTotal = specialAdder(1234,5678);
        System.out.print("Answer: " + studentTotal);
    }
    static int specialAdder(int firstNumber,int secondNumber){
        int total;
        if (firstNumber >= 1000 && firstNumber <= 9999 && secondNumber >= 1000 && secondNumber <= 9999){
            total = firstNumber + secondNumber;
        }
        else{
            total = 0;
        }
        return total;
    }
}
