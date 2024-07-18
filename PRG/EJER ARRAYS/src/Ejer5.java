public class Ejer5 {
    public static void main(String[] args) {
        final int FIL = 15;
        final int COL = 3;
        int[][] alumnos = new int[FIL][COL];
        for (int i = 0; i < FIL; i++) {
            System.out.println("Alumno " + (i + 1) + ":");
            alumnos[i][0] = Leer.leerEntero("Introduce numero expediente: ");
            alumnos[i][1] = Leer.leerEntero("Introduce nota: ");
            alumnos[i][2] = Leer.leerEntero("Introduce edad: ");
        }
        System.out.println("Expediente       Nota         Edat");
        for (int i = 0; i < FIL; i++) {
            System.out.println();
            for (int j = 0; j < COL; j++) {
                System.out.print("    " + alumnos[i][j] + "        ");
            }
        }
        System.out.println();
        int nexp = Leer.leerEntero("Dime un numero de expediente: ");
        for (int i = 0; i < FIL; i++) {
            for (int j = 0; j < 1; j++) {
                if (nexp == alumnos[i][j])
                    System.out.println("El alumno con expediente " + alumnos[i][0] + " tiene una no ta de " + alumnos[i][1] + " y " + alumnos[i][2] + " años");
            }
        }
    }
}