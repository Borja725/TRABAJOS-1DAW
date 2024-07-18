public class Main {
    public static void main(String[] args) {
        int seleccio;
        do {
            seleccio = Leer.leerEntero("Quin exercici vols? ");

            switch (seleccio) {
                case 1:
                    Cadenas.ejer1();
                    break;
                case 2:
                    Cadenas.ejer2();
                    break;
            }
        } while (seleccio != 0);
    }
}