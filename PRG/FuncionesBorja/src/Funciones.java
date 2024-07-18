public class Funciones {
    public static void main(String[] args) {
    }

    public static void mostrarVectorInt(int vector[]) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
            if (i < vector.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("");
    }

    public static void mostrarMatrizInt(int matriz[][]) {
        for (int fil = 0; fil < matriz.length; fil++) {
            Funciones.mostrarVectorInt(matriz[fil]);
        }
    }

    public static void copiar2Vectores(int org[], int dest[]) {
        if (org.length != dest.length) {
            System.out.println("Los vectores tienen tamaño diferente");
        } else {
            for (int i = 0; i < dest.length; i++) {
                dest[i] = org[i];
                System.out.print(dest[i] + ", ");
            }
        }
    }

    public static void copiarVector(int org1[]) {
        int c = org1.length;
        int[] dest1 = new int[c];
        Funciones.copiar2Vectores(org1, dest1);
    }

    public static boolean igualesVectores(int[] vec1, int[] vec2) {
        boolean exist = false;
        if (vec1.length == vec2.length) {
            for (int i = 0; i < vec1.length; i++) {
                if (vec1[i] != vec2[i]) {
                    exist = false;
                } else {
                    exist = true;
                }
            }
        } else {
            exist = false;
        }
        return exist;
    }

    public static double multiplica(double a, double b) {
        return a * b;
    }

    public static boolean esPitagoras(double p, double y, double v) {
        return Math.pow(p, 2) + Math.pow(y, 2) == Math.pow(v, 2);
    }

    public static boolean esMayorEdad(int a) {
        return a >= 18;
    }
}
