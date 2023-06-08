package ejercicio_uno_examen;


import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
import java.io.IOException;

public class MatrixCalculatorTest {
    @Test
    public void testCalcularMatrizB_CasoBase() throws IOException {
        int[][] matrizA = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] matrizC = {
                {7, 8, 9},
                {10, 11, 12}
        };
        int[][] matrizEsperada = {
                {6, 6, 6},
                {6, 6, 6}
        };

        int[][] matrizB = MatrixCalculator.calcularMatrizB(matrizA, matrizC);

        Assertions.assertArrayEquals(matrizEsperada, matrizB);
    }

    @Test
    public void testCalcularMatrizB_MatricesVacias() throws IOException {
        int[][] matrizA = {};
        int[][] matrizC = {};
        int[][] matrizEsperada = {};

        int[][] matrizB = MatrixCalculator.calcularMatrizB(matrizA, matrizC);

        Assertions.assertArrayEquals(matrizEsperada, matrizB);
    }

    @Test
    public void testCalcularMatrizB_MatricesDiferentesTamanios() throws IOException {
        int[][] matrizA = {
                {1, 2},
                {3, 4}
        };
        int[][] matrizC = {
                {5, 6, 7},
                {8, 9, 10}
        };

        // El tamaño de las matrices no es compatible, se espera una excepción
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            MatrixCalculator.calcularMatrizB(matrizA, matrizC);
        });
    }
}