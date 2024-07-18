// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int opcio = 5;
        while (opcio != 3) {
            System.out.println("Programa Casas");
            System.out.println("1. Crear 8 objetos");
            System.out.println("2. Punto 6");
            System.out.println("3. Salir");
            opcio = Leer.leerEntero("Elige una opcion: ");
            if (opcio == 1) {
                Casa ca = new Casa(12,4,"negro");
                ca.mostrarDatos();
                Chalet chal = new Chalet(15, 5, "Azul", 1000, 22, "Naranja");
                chal.pintarChalet("Naranja");
                chal.aumentaMantener();
                chal.mostrarDatos();
                Piso pis = new Piso(11, 3, "Gris", 4, 2);
                pis.mostrarDatos();
                Adosado ados = new Adosado(9, 2, "Verde", 2, true);
                ados.mostrarDatos();
                Casa ca1 = new Casa(9,2,"Morado");
                ca1.mostrarDatos();
                Chalet chal1 = new Chalet(14,5,"rojo",2000,50,"verde");
                chal1.mostrarDatos();
                Piso pis1 = new Piso(13, 4, "Groc", 5, 1);
                pis.mostrarDatos();
                Adosado ados1 = new Adosado(10,3,"Blanco",1,false);
                ados1.mostrarDatos();
            } else if (opcio == 2) {
                int numHouses = Leer.leerEntero("¿Cuántas casas tiene en propiedad?");

                Casa[] userHouses = new Casa[numHouses];

                for (int i = 0; i < numHouses; i++) {
                    System.out.println("Introduce los detalles de la casa " + (i + 1));
                    String tipo = Leer.leerTexto("Tipo de casa (Chalet, Adosado, Piso):");
                    int qPuertas = Leer.leerEntero("Número de puertas:");
                    int qVentanas = Leer.leerEntero("Número de ventanas:");

                    switch (tipo.toLowerCase()) {
                        case "chalet":
                            int costeMantenimiento = Leer.leerEntero("Coste de mantenimiento:");
                            String colorValla = Leer.leerTexto("Color de la valla:");
                            int mjardin = Leer.leerEntero("m2 del jardin: ");
                            userHouses[i] = new Chalet(qPuertas, qVentanas, "blanco", costeMantenimiento, mjardin, colorValla);
                            break;
                        case "adosado":
                            String color = Leer.leerTexto("Color Piso: ");
                            int tieneCochera = Leer.leerEntero(" Numero de cocheras:");
                            boolean tienePatio = Boolean.parseBoolean(Leer.leerTexto("¿Tiene patio? (true/false):"));
                            userHouses[i] = new Adosado(qPuertas, qVentanas, color, tieneCochera, tienePatio);
                            break;
                        case "piso":
                            int qBalcones = Leer.leerEntero("Número de balcones:");
                            String color1 = Leer.leerTexto("Color Piso: ");
                            int nplanta = Leer.leerEntero("Numero de planta: ");
                            userHouses[i] = new Piso(qPuertas, qVentanas, color1, nplanta, qBalcones);
                            break;
                        default:
                            System.out.println("Tipo de casa no válido.");
                    }
                }

                System.out.println("Información de las casas del usuario:");
                for (Casa casa : userHouses) {
                    System.out.println(casa);
                }
                System.out.println("Datos detallados de las casas del usuario:");
                for (Casa casa : userHouses) {
                    casa.mostrarDatos();
                }
            } else {
                System.out.println("Opcion no valida");
            }
        }
    }
}