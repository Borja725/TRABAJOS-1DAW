import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String cont = null;
        do {
            String ruta = Leer.leerTexto("Introduce una ruta de sistema de archivos de tu ordenador: ");
            try {
                muestraInfoRuta(ruta);
            } catch (FileNotFoundException e) {
                System.out.println(e);
            }
            cont = Leer.leerTexto("quieres continuar? (si/no) ");
        } while (cont.equalsIgnoreCase("si"));
    }

    public static void muestraInfoRuta(String file) throws FileNotFoundException {
        File d = new File(file);
        if (!d.exists()) {
            throw new FileNotFoundException("La ruta no existeix");
        }
        if (d.isFile()) {
            System.out.println("La ruta introduida es un Fitxer: ");
            System.out.println("- " + d.getName());
        } else if (d.isDirectory()) {
            System.out.println("La ruta introduida es un directori: ");
            System.out.println("d " + d.getName());
            System.out.println("\n Subdirectoris: ");
            File []llista = d.listFiles();
            for (File llist : llista) {
                if (llist.isFile()) {
                    System.out.println("- " + llist.getName());
                } else if (llist.isDirectory()) {
                    System.out.println("d " + llist.getName());
                }
            }
        }
    }
}