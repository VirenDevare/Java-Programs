package com.viren;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int ans = 0;;
        try (Scanner in = new Scanner(System.in)) {

            while (true) {
                System.out.print("Write the operator ");
                char op = in.next().trim().charAt(0);
                if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                    System.out.println("Write your first number");
                    int num1 = in.nextInt();
                    System.out.println("Write your second number");
                    int num2 = in.nextInt();

                    if (op == '+') {
                        ans = num1 + num2;
                    }
                    if (op == '-') {
                        ans = num1 - num2;
                    }
                    if (op == '*') {
                        ans = num1 * num2;
                    }
                    if (op == '/') {
                        if (num2 != 0) {
                            ans = num1 / num2;
                        }
                    }
                    if (op == '%') {
                        ans = num1 % num2;
                    }
                } else if (op == 'x' || op == 'X') {
                    break;
                } else {
                    System.out.println("Invalid Operation");
                }
                System.out.println("Your Answer is :");
                System.out.println(ans);
            }
        }
    }
}
