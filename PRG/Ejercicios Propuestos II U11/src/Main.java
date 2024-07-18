import java.io.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        String archivo = Leer.leerTexto("Introduce la ruta de un archivo de texto para contar los parrafos: ");
        File d = new File(archivo);
        if (!d.exists()) {
            throw new FileNotFoundException("La ruta no existe");
        }
        else if (d.isDirectory()) {
            System.out.println("Introduce una ruta que no sea un directorio");
        }
        else if (d.isFile()) {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String s="";
            int c = 0;
            int contador=1;
            while ( br.ready() ) {
                s = br.readLine();
                c += s.length();
                if (!s.isEmpty()) {
                    System.out.println("\nParraf " + contador + ":");
                    System.out.println( s );
                    System.out.println("Numero de caracters: " + c); contador+=1;
                }
                c=0;
                }
            br.close();
            fr.close();
        }
    }
}