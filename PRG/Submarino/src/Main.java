import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean salir = false;

        while (!salir) {
            System.out.println("¡Bienvenido al juego del submarino!");
            System.out.println("1. Jugar partida");
            System.out.println("2. Ayuda");
            System.out.println("3. Salir");

            int opcion = Leer.leerEntero("Elige una opcion: ");
            switch (opcion) {
                case 1:
                    Funciones.jugarPartida();
                    break;
                case 2:
                    Funciones.mostrarAyuda();
                    break;
                case 3:
                    System.out.println("¡Gracias por jugar!");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
            }
        }
    }
}
