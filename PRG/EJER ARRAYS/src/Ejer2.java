import java.util.ArrayList;
public class Ejer2 {
    public static void main(String[] args) {
        int[] losNumeros = new int[10];
        String seleccio = "z";
        do {
            System.out.println("a. Mostrar valores");
            System.out.println("b. Introducir valor");
            System.out.println("c. Salir");
            seleccio = Leer.leerTexto("Seleccion: ");
            if (seleccio.equalsIgnoreCase("a")) {
                for (int num : losNumeros) {
                    System.out.print(num + " ");
                }
                System.out.println();
            } else if (seleccio.equalsIgnoreCase("b")) {
                System.out.println("INSERTAR DATOS: ");
                int b = Leer.leerEntero("Valor a introducir: ");
                int c = Leer.leerEntero("Posicion para el valor anterior: (0-9) ");
                if (c > 9)
                    System.out.println("Introduce un valor dentro del rango");
                else
                    losNumeros[c] = b;
            } else {
                break;
            }
        } while (seleccio != "c");
    }
}



