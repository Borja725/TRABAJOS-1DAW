import java.util.Arrays;

public class Funciones {
    static int[][] tablero;
    static int dimensionDelMar;
    static int submarinoX;
    static int submarinoY;

    public static void iniciarSubmarino() {
        submarinoX = (int) (Math.random() * dimensionDelMar);
        submarinoY = (int) (Math.random() * dimensionDelMar);
    }

    public static void calibrar(int x, int y) {
        if (x == submarinoX && y == submarinoY) {
            System.out.println("¡Has encontrado el submarino!");
            imprimirTablero(true);
            System.exit(0);
        } else if (Math.abs(x - submarinoX) <= 1 && Math.abs(y - submarinoY) <= 1) {
            System.out.println("Estás cerca del submarino.");
        } else {
            System.out.println("No hay submarino en esta posición.");
        }
    }

    public static void imprimirTablero(boolean mostrarSubmarino) {
        if (mostrarSubmarino) {
            for (int i = 0; i < dimensionDelMar; i++) {
                for (int j = 0; j < dimensionDelMar; j++) {
                    if (i == submarinoX && j == submarinoY) {
                        System.out.print("x ");
                    } else if (Math.abs(i - submarinoX) <= 1 && Math.abs(j - submarinoY) <= 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("- ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void jugarPartida() {
        Funciones.dimensionDelMar = Leer.leerEntero("Introduce las dimensiones del mar: ");

        Funciones.tablero = new int[Funciones.dimensionDelMar][Funciones.dimensionDelMar];
        Funciones.iniciarSubmarino();

        int intentos = Leer.leerEntero("Introduce el número inicial de intentos disponibles: ");

        for (int i = 1; i <= intentos; i++) {
            System.out.println("Intento " + i + " de " + intentos);
            int cordx = Leer.leerEntero("Coordenada x a calibrar? ");
            int cordy = Leer.leerEntero("Coordenada y a calibrar? ");
            Funciones.calibrar(cordx, cordy);
        }
    }

    public static void mostrarAyuda() {
        System.out.println("¡Bienvenido al juego del submarino!");
        System.out.println("El objetivo del juego es encontrar la posición del submarino.");
        System.out.println("Para ello, deberás introducir las coordenadas donde crees que se encuentra.");
        System.out.println("Recibirás pistas del sonar que te indicarán si estás cerca o lejos del submarino.");
    }
}
