package com.example;

public class Lab1 {
    public static void main(String[] args) {
        System.out.println("Лабораторна робота №1. Варіант 5108\n");
        try {
            char[][] arrayA = {
                    {'a', 'b', 'c'},
                    {'d', 'e', 'f'},
                    {'g', 'h', 'i'}
            };
            char[][] arrayB = {
                    {'1', '2', '3'},
                    {'4', '5', '6'},
                    {'7', '8', '9'}
            };
            Matrix matrixA = new Matrix(arrayA);
            Matrix matrixB = new Matrix(arrayB);

            System.out.println("Матриця А:");
            matrixA.print();

            System.out.println("Матриця B:");
            matrixB.print();

            Matrix matrixC = matrixA.xor(matrixB);
            System.out.println("Матриця C:");
            matrixC.print();

            long variantSum = matrixC.calculateVariantSum();
            System.out.println("Фінальна сума (Max у парних, Min у непарних): " + variantSum);
        } catch (Exception e) {
            System.err.println("Виникла помилка: " + e.getMessage());
        }
    }
}