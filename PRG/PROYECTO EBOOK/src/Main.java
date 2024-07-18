/**
 *
 * @author Borja Pellicer Moncho - 20941385
 * 26/02/2024
 *
 */
public class Main {
    public static void main(String[] args) {

        eBook eb = new eBook("editorialaules", "Javi Beteta");
        eBook eb1 = new eBook("editorialalumnes", "Jorge Molio");
        eBook ebinstancia = new eBook(1040230, "Clase de prg", 42.235F, "novaeditorial", "si", "Espe");

        System.out.println("Segon eBook: ");
        eBook ebinstancia1 = new eBook();
        ebinstancia1.ISBN = Leer.leerEntero("Introduce ISBN: ");
        ebinstancia1.titulo = Leer.leerTexto("Introduce el titulo: ");
        ebinstancia1.tamaño = Leer.leerDouble("Introduce tamaño en KB: ");
        ebinstancia1.editorial = Leer.leerTexto("Introduce la editorial: ");
        ebinstancia1.audible = Leer.leerTexto("es audible: SI/NO: ");
        ebinstancia1.autor = Leer.leerTexto("Introduce el autor: ");
        System.out.println("Tercer eBook: ");
        eBook ebinstancia2 = new eBook();
        ebinstancia2.ISBN = Leer.leerEntero("Introduce ISBN: ");
        ebinstancia2.titulo = Leer.leerTexto("Introduce el titulo: ");
        ebinstancia2.tamaño = Leer.leerDouble("Introduce tamaño en KB: ");
        ebinstancia2.editorial = Leer.leerTexto("Introduce la editorial: ");
        ebinstancia2.audible = Leer.leerTexto("es audible: SI/NO: ");
        ebinstancia2.autor = Leer.leerTexto("Introduce el autor: ");
        double pagines = ebinstancia.tamaño / 3.325;
        double pagines1 = ebinstancia1.tamaño / 3.325;
        double pagines2 = ebinstancia2.tamaño / 3.325;
        int opcion = 6;
        do {
            System.out.println("1. Num paginas");
            System.out.println("2. tiempo lectura");
            System.out.println("3. mostrar");
            System.out.println("4. Salir");
            opcion = Leer.leerEntero("Introduce una opcion: ");

            switch (opcion) {
                case 1:
                    numPaginas(ebinstancia, ebinstancia1, ebinstancia2);
                    break;
                case 2:
                    tiempoLectura(pagines, pagines1, pagines2);
                    break;
                case 3:
                    mostrar(ebinstancia, ebinstancia1, ebinstancia2);
            }
        } while (opcion != 4);



    }

    public static void numPaginas(eBook ebinstancia, eBook ebinstancia1, eBook ebinstancia2 ) {
        double tamaño = ebinstancia.tamaño;
        double pagines = tamaño / 3.325;
        System.out.println("Numero de pagines del primer ebook: " + pagines);
        double tamaño1 = ebinstancia1.tamaño;
        double pagines1 = tamaño1 / 3.325;
        System.out.println("Numero de pagines del segon ebook: " + pagines1);
        double tamaño2 = ebinstancia2.tamaño;
        double pagines2 = tamaño2 / 3.325;
        System.out.println("Numero de pagines del tercer ebook: " + pagines2);
    }

    public static void tiempoLectura(double pagines, double pagines1, double pagines2) {
        double tiempo = pagines / 2;
        System.out.println("Temps que es tarda en llegir el primer eBook: " + tiempo + " minuts");
        double tiempo1 = pagines1 / 2;
        System.out.println("Temps que es tarda en llegir el segon eBook: " + tiempo1 + " minuts");
        double tiempo2 = pagines2 / 2;
        System.out.println("Temps que es tarda en llegir el tercer eBook: " + tiempo2 + " minuts");
    }

    public static void mostrar(eBook ebinstancia, eBook ebinstancia1, eBook ebinstancia2) {
        double temps = ebinstancia.tamaño / 3.325;
        double temps1 = ebinstancia1.tamaño / 3.325;
        double temps2 = ebinstancia2.tamaño / 3.325;
        System.out.println("Primer eBook");
        int ISBN = ebinstancia.ISBN;
        System.out.println("ISBN: " + ISBN);
        String titulo = ebinstancia.titulo;
        System.out.println("Titulo: " + titulo);
        double tamaño = ebinstancia.tamaño;
        System.out.println("tamaño: " + tamaño + " KB");
        System.out.println("Tiempo lectura: " + temps + " minuts");
        System.out.println("Segon eBook");
        int ISBN1 = ebinstancia1.ISBN;
        System.out.println("ISBN: " + ISBN1);
        String titulo1 = ebinstancia1.titulo;
        System.out.println("Titulo: " + titulo1);
        double tamaño1 = ebinstancia1.tamaño;
        System.out.println("tamaño: " + tamaño1 + " KB");
        System.out.println("Tiempo lectura: " + temps1 + " minuts");
        System.out.println("Tercer eBook");
        int ISBN2 = ebinstancia2.ISBN;
        System.out.println("ISBN: " + ISBN2);
        String titulo2 = ebinstancia2.titulo;
        System.out.println("Titulo: " + titulo2);
        double tamaño2 = ebinstancia2.tamaño;
        System.out.println("tamaño: " + tamaño2 + " KB");
        System.out.println("Tiempo lectura: " + temps2 + " minuts");

    }
}