package com.startjava.lesson_2_3_4.calculator;

class Calculator {
    public static double calculate(String str) {
        String[] elements = str.split(" ");
        int a = Integer.parseInt(elements[0]);
        int b = Integer.parseInt(elements[2]);
        char operator = elements[1].charAt(0);
        return switch (operator) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> {
                yield a / b;
            }
            case '%' -> {
                yield a % b;
            }
            case '^' -> Math.pow(a, b);
            default -> {
                System.out.println("Ошибка: знак " + operator + " не поддерживается");
                yield Double.MIN_VALUE;
            }
        };
    }
}