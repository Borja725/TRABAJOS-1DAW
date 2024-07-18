// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Coche []coches = new Coche[4];
        System.out.println("PROGRAMA CONCESIONARIO");
        coches[0] = new Coche(3,"6522 KFR", "Toyota", "RAV-4", "Blanco", 32000);
        coches[1] = new Coche2mano(2,"FORD", "Fiesta", "8664 RFS", "Negro", 18000, 203541, 12);
        coches[1].setPrecio(coches[1].getPrecio() * 1.03);
        System.out.println("INFORMACION SOBRE COCHE");
        for (int i = 0; i < 2;i++) {
            System.out.println("1-Coche");
            System.out.println("2-Coche Segunda Mano");
            int opcion = Leer.leerEntero("Dime una opcion: (La siguiente vez que se ejecute sera la opcion no elegida anteriormente): ");
            switch (opcion) {
                case 1:
                    System.out.println("Opcion Coche");
                    int numbastidor = Leer.leerEntero("Dime el numero de bastidor: ");
                    String Matricula = Leer.leerTexto("Introduce el numero de matricula: ");
                    String marca = Leer.leerTexto("Introduce la marca del coche: ");
                    String modelo = Leer.leerTexto("Introduce el modelo del coche: ");
                    String color = Leer.leerTexto("Introduce el color del coche: ");
                    double precio = Leer.leerDouble("Introduce el precio del coche: ");
                    coches[2] = new Coche(numbastidor, Matricula, marca, modelo, color, precio);
                    break;
                case 2:
                    System.out.println("Opcion Coche2mano");
                    int numbastidor1 = Leer.leerEntero("Dime el numero de bastidor: ");
                    String Matricula1 = Leer.leerTexto("Introduce el numero de matricula: ");
                    String marca1 = Leer.leerTexto("Introduce la marca del coche: ");
                    String modelo1 = Leer.leerTexto("Introduce el modelo del coche: ");
                    String color1 = Leer.leerTexto("Introduce el color del coche: ");
                    double precio1 = Leer.leerDouble("Introduce el precio del coche: ");
                    int km = Leer.leerEntero("Introduce el numero de km: ");
                    int anios = Leer.leerEntero("Introduce los años del coche: ");
                    coches[3] = new Coche2mano(numbastidor1, Matricula1, marca1, modelo1, color1, precio1, km, anios);
                    break;
            }
        }
        System.out.println("Información de los Coches del usuario:");
        for (Coche coche : coches) {
            System.out.println(coche);
        }
        System.out.println("Datos detallados de los Coches del usuario:");
        for (Coche coche : coches) {
            System.out.println(coche);
            System.out.println("Detalles: ");
            coche.mostrarInfo();
        }
    }
    public static void mostrarKms (Coche coche) {
        if (coche instanceof Coche2mano) {
            System.out.println(((Coche2mano) coche).getKm());
        } else {
            System.out.println("Coche Nuevo : 0 Km");
        }
    }
}