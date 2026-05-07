package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testMatrixInitialization() {
        char[][] data = {{'A', 'B'}, {'C', 'D'}};
        Matrix m = new Matrix(data);
        assertEquals('A', m.getElement(0, 0));
        assertEquals('D', m.getElement(1, 1));
    }

    @Test
    public void testXorOperation() throws Exception {
        char[][] dataA = { {(char) 5, (char) 10} };
        char[][] dataB = { {(char) 3, (char) 6} };

        Matrix matrixA = new Matrix(dataA);
        Matrix matrixB = new Matrix(dataB);

        Matrix matrixC = matrixA.xor(matrixB);

        assertEquals((char) 6, matrixC.getElement(0, 0));
        assertEquals((char) 12, matrixC.getElement(0, 1));
    }

    @Test
    public void testXorDimensionMismatch() {
        Matrix matrixA = new Matrix(new char[][] { {'A'} });
        Matrix matrixB = new Matrix(new char[][] { {'A', 'B'} });

        assertThrows(Exception.class, () -> {
            matrixA.xor(matrixB);
        });
    }

    @Test
    public void testCalculateVariantSum() {
        char[][] data = {
                {(char)10, (char)50, (char)20},
                {(char)80, (char)30, (char)90},
                {(char)15, (char)10, (char)25}
        };

        Matrix matrix = new Matrix(data);
        long sum = matrix.calculateVariantSum();

        assertEquals(105, sum);
    }
}