import java.io.File;
import java.io.FileNotFoundException;

public class Programa3 {
    public static void main(String[] args) throws FileNotFoundException {
        String ruta = Leer.leerTexto("Introduce una ruta de sistema de archivos que quieras eliminar: ");
        borraTodo(ruta);
    }

    public static boolean borraTodo(String f) throws FileNotFoundException {
        Boolean borrar=false;
        File ruta = new File(f);
        if (!ruta.exists()) {
            throw new FileNotFoundException("Ruta no encontrada!");
        }
        if (ruta.isFile()) {
            ruta.delete();
            borrar=true;
        }
        if (ruta.isDirectory()) {
            for (File llista : ruta.listFiles()) {
                llista.delete();
            }
            ruta.delete();
            borrar=true;
        }
        return borrar;
    }
}
