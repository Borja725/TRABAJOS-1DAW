import java.util.Scanner;
public class Ejer6_1 {
    public static void main(String[] args) {
        double[][] temperaturas = new double[30][4];

        for (int i = 0; i < 30; i++) {
            System.out.println("Introduce las temperaturas para el día " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                temperaturas[i][j] = Leer.leerDouble("Temperatura a las " + (j * 6) + " horas: ");
            }
            if (temperaturas[i][0] == 0) {
                break;
            }
        }
        int opcion;
        do {
            System.out.println("1. Temperatura media de un día.");
            System.out.println("2. Temperatura media de una hora.");
            System.out.println("3. Temperatura media del mes.");
            System.out.println("4. Salir");
            opcion = Leer.leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1:
                    int diaSeleccionado = Leer.leerEntero("Introduce el día para obtener la temperatura media: ");
                    if (diaSeleccionado > 0 && diaSeleccionado <= 30) {
                        double sumaDia = 0;
                        for (int i = 0; i < 4; i++) {
                            sumaDia += temperaturas[diaSeleccionado - 1][i];
                        }
                        double temperaturaMediaDia = sumaDia / 4;
                        System.out.println("Temperatura media del día " + diaSeleccionado + ": " + temperaturaMediaDia);
                    } else {
                        System.out.println("Día no válido.");
                    }
                    break;

                case 2:
                    int horaSeleccionada = Leer.leerEntero("Introduce la hora para obtener la temperatura media: ");
                    if (horaSeleccionada >= 0 && horaSeleccionada <= 18 && horaSeleccionada % 6 == 0) {
                        double sumaHora = 0;
                        for (int i = 0; i < 30; i++) {
                            sumaHora += temperaturas[i][horaSeleccionada / 6];
                        }
                        double temperaturaMediaHora = sumaHora / 30;
                        System.out.println("Temperatura media a las " + horaSeleccionada + " horas: " + temperaturaMediaHora);
                    } else {
                        System.out.println("Hora no válida.");
                    }
                    break;

                case 3:
                    double sumaMes = 0;
                    for (int i = 0; i < 30; i++) {
                        for (int j = 0; j < 4; j++) {
                            sumaMes += temperaturas[i][j];

                        }

                    }
                    double temperaturaMediaMes = sumaMes / (30 * 4);
                    System.out.println("Temperatura media del mes: " + temperaturaMediaMes);
                    break;

                case 4:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 4);
    }
}
















