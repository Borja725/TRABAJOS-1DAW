/**
 *
 * @author Borja Pellicer Moncho - 20941385
 * 26/02/2024
 *
 */
public class Main {
    public static void main(String[] args) {
        int opcion= 7;
        int fil = Leer.leerEntero("Introduce el numero de filas: ");
        int col = Leer.leerEntero("Introduce el numero de columnas: ");
        int [][]matriz = new int[fil][col];
        int ini= 1;
        int fin = 1;
        do {
            System.out.println("1. Generar Matriz");
            System.out.println("2. Divisores de N");
            System.out.println("3. Sumar columna");
            System.out.println("4. Imprimir matriz");
            System.out.println("0. Salir");
            opcion = Leer.leerEntero("Introduce una opcion: ");

            switch (opcion) {
                case 1:
                    ini = Leer.leerEntero("Valor inicial aleatorio: ");
                    fin = Leer.leerEntero("Valor final aleatorio: ");
                    Calcular.rellenaMatriz(matriz, ini, fin);
                    break;
                case 2:
                    Calcular.rellenaMatriz(matriz, ini, fin);
                    int num = Leer.leerEntero("Introduce un numero para calcular los divisores: ");
                    Calcular.numDivisores(matriz, num);
                    break;
                case 3:
                    Calcular.rellenaMatriz(matriz, ini, fin);
                    int colum = Leer.leerEntero("Introduce una columna para calcular el total: ");
                    Calcular.SumaColMatriz(matriz, colum);
                    break;
                case 4:
                    Calcular.imprimeMatriz(matriz);
                    break;
            }
        } while (opcion != 0);


    }
}