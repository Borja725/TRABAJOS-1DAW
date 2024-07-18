// Press Shift tw
// ice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int ejer = Leer.leerEntero("Quin exercici vols: (1-8) ");
        switch (ejer) {
            case 1:
                int[] v1 = new int[10];
                Funciones.mostrarVectorInt(v1);
                break;
            case 2:
                int[][] matriu = new int[5][3];
                Funciones.mostrarMatrizInt(matriu);
                break;
            case 3:
                int[] org = {5, 2, 8, 31, 35, 3, 24};
                int[] dest = {1, 4, 7, 12, 6, 9, 15};
                Funciones.copiar2Vectores(org, dest);
                break;
            case 4:
                int[] org1 = {5, 2, 8, 31, 4, 63, 24, 56};
                Funciones.copiarVector(org1);
                break;
            case 5:
                int[] vec1 = {4, 75, 63, 84, 92, 2, 7};
                int[] vec2 = {4, 75, 63, 84, 92, 2, 7};
                boolean x = Funciones.igualesVectores(vec1, vec2);
                System.out.println(x);
                break;
            case 6:
                double a = Leer.leerDouble("Introduce el primer numero: ");
                double b = Leer.leerDouble("Introduce el segundo numero: ");
                double z = Funciones.multiplica(a, b);
                System.out.println(z);
                break;
            case 7:
                double p = Leer.leerDouble("Introduce el valor de x: ");
                double y = Leer.leerDouble("Introduce el valor de y: ");
                double v = Leer.leerDouble("Introduce el valor de z: ");
                boolean u = Funciones.esPitagoras(p, y, v);
                System.out.println(u);
                break;
            case 8:
                int edad = Leer.leerEntero("Introduce tu edad: ");
                boolean mayorEdad = Funciones.esMayorEdad(edad);
                System.out.println("¿Es major de edad? " + mayorEdad);
                break;
        }
    }
}
