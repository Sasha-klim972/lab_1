package com.example;

public class Matrix {
    private final char[][] data;
    private final int rows;
    private final int cols;

    public Matrix(char[][] inputData) {
        this.rows = inputData.length;
        this.cols = inputData[0].length;
        this.data = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            System.arraycopy(inputData[i], 0, this.data[i], 0, cols);
        }
    }

    public Matrix xor(Matrix other) throws Exception {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new Exception("Розміри матриць різні!");
        }
        char[][] resultData = new char[this.rows][this.cols];
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                resultData[i][j] = (char) (this.data[i][j] ^ other.data[i][j]);
            }
        }
        return new Matrix(resultData);
    }

    public long calculateVariantSum() {
        long sum = 0;
        for (int i = 0; i < this.rows; i++) {
            char target = this.data[i][0];
            for (int j = 1; j < this.cols; j++) {
                if (i % 2 == 0) {
                    if (this.data[i][j] > target) {
                        target = this.data[i][j];
                    }
                } else {
                    if (this.data[i][j] < target) {
                        target = this.data[i][j];
                    }
                }
            }
            sum += target;
        }
        return sum;
    }

    public char getElement(int row, int col) {
        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            throw new IndexOutOfBoundsException("Вихід за межі матриці");
        }
        return data[row][col];
    }

    public void print() {
        for (int i = 0; i < this.rows; i++) {
            System.out.println(java.util.Arrays.toString(this.data[i]));
        }
    }
}