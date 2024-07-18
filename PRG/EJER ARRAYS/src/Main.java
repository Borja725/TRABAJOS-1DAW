import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numerosPares = new int[100];

        for (int i = 0, num = 2; i < 100; i++, num += 2) {
            numerosPares[i] = num;
        }

        System.out.println("Los primeros 100 números pares son:");
        for (int num : numerosPares) {
            System.out.print(num + " ");
        }
        System.out.println();

        int sumaUltimos30 = 0;
        for (int i = 70; i < 100; i++) {
            sumaUltimos30 += numerosPares[i];
        }

        System.out.println("La suma de los últimos 30 números es: " + sumaUltimos30);


        }
    }
