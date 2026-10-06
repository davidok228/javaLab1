package ru.itmo.prog.samples;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        short[] k = new short[17]; // кол-во строк
        double[] x = new double[10]; // кол-во столбцов
        double[][] g = new double[17][10];
        Random rand = new Random();

        for (int i = 0; i < k.length; i++) {
        	k[i] = (short)(i + 3);
        }

        for (int i = 0; i < x.length; i++) {
            x[i] = (-9.0) + rand.nextDouble() * (9.0-(-9.0));
        }

        for (int i = 0; i < k.length; i++) {
            for (int j = 0; j < x.length; j++) {
                g[i][j] = calculateElement(k[i], x[j]);

            }
        }

        printMatrix(g);

    }

    private static void printMatrix(double[][] matrix) {
        for (double[] row: matrix) {
            for (double value: row) {
                if (Double.isNaN(value)) {
                    System.out.printf("%10s", "DNE");
                } else {
                    System.out.printf("%10.2f", value);
                }
            }
            System.out.println();
        }
    }

    private static double calculateElement(short k, double x) {
        switch (k) {
            case 19 -> {
                
                return Math.tan(Math.asin(Math.pow(x, 2)));
            } case 3, 4, 6, 9, 13, 15, 16, 18 -> {
                return Math.log(Math.pow(Math.sin(Math.tan(Math.cos(x))), 2));
            } default -> {
                double numerator = 2 + Math.asin(Math.cos(Math.cos(Math.cbrt(x))));
                double base = numerator / Math.PI;

                double fraction = (0.75 - x) / 0.5;
                double cubFraction = Math.pow(fraction, 3);
                double degree = Math.cbrt(Math.cbrt(cubFraction));

                return Math.pow(base, degree);

            }
        }
    }
}
