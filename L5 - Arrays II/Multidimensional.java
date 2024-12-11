package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Multidimensional {
    public static void main(String... args) {

        example1();
        example2();
    }

    public static void example1() {

        // Declarar un array de 2 filas y 3 columnas
        // Establecer la longitud de las filas es obligatorio, la longitud de las
        // columnas es opcional
        int[][] scores = new int[2][3];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Enter the values for " + (i + 1) + " row: \n");
            for (int j = 0; j < scores[i].length; j++) {
                scores[i][j] = scan.nextInt();
            }
        }
        scan.close();

        // Imprimir el array multidimensional
        System.out.println(Arrays.deepToString(scores));
    }

    public static void example2() {
        Scanner s = new Scanner(System.in);
        double[][] numbers2 = new double[3][];
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println("creating my " + "" + (i + 1) + "row" + "for a specify size n");
            int n = s.nextInt();
            numbers2[i] = new double[n];

            for (int j = 0; j < numbers2[i].length; j++) {
                System.out.println("enter the value");
                numbers2[i][j] = s.nextDouble();
            }
        }

        System.out.println(Arrays.deepToString(numbers2));
    }

}

/*
 * NOTES:
 * col0 col1 col2 col3
 * names [0] >>>> names[0][0], names[0][1],names[0][2],names[0][3]
 * names [1] >>>> names[1][0], names[1][1],names[1][2],names[1][3]
 * names [2] >>>> names[2][0], names[2][1],names[2][2],names[2][3]
 * names [3] >>>> names[3][0], names[3][1],names[3][2],names[3][3]
 */
