package com.company;

public class Main {

    public static void main(String[] args) {
        // Number Declarations
        int firstNumber;
        int secondNumber;
        int answer;

        // Number Initialized
        firstNumber = 5;
        secondNumber = 7;
        answer = 0;

        // Mathematical Operat
        String operator = "-";

        if (operator.equals("+")) {
            answer = firstNumber + secondNumber;
        } else if (operator.equals("-")) {
            answer = firstNumber - secondNumber;
        } //
       // Do the else if statements for the multiplication and division
        System.out.println(answer);
    }
}
