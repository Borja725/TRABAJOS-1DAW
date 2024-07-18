import javax.swing.*;

public class Calcular {
    public static void rellenaMatriz(int[][] matriz, int ini, int fin) {

        for (int fil = 0; fil < matriz.length; fil++) {
            for (int col = 0; col < matriz.length; col++) {
                int random = (int) (Math.random() * fin);
                matriz[fil][col]= random;
            }
        }
    }

    public static void numDivisores(int[][] matriz, int num) {
        for (int fil = 0; fil < matriz.length; fil++) {
            for (int col = 0; col < matriz.length; col++) {
                if (matriz[fil][col] % num == 0) {
                    System.out.println("fila" + fil + matriz[fil][col]);
                }
            }
        }
    }

    public static void SumaColMatriz(int[][] matriz, int colum) {
        int total = 0;
        for (int fil = 0; fil < matriz.length; fil++) {
            for (int col = 0; col < matriz.length; col++) {
                total += matriz[col][fil];
            }
        }
        System.out.println("Total de la columna" + colum + ":" + total);
    }
    public static void imprimeMatriz(int[][] matriz) {
        for (int fil = 0; fil < matriz.length; fil++) {
            System.out.println();
            for (int col = 0; col < matriz.length; col++) {
                System.out.print(matriz[fil][col]);
            }
        }
    }
}
