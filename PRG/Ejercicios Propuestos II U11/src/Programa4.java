import java.io.*;
import java.util.Random;

public class Programa4 {
    public static void main(String[] args) throws IOException {
        int opcion=0;
        while (opcion != 4) {


            System.out.println("1-Generar Archivo Enteros");
            System.out.println("2-mostrar Fichero Enteros");
            System.out.println("3-Añadir Fichero Enteros");
            System.out.println("4-Salir");
            opcion = Leer.leerEntero("Introduce una opcion: ");
            switch (opcion) {
                case 1:
                    String archivo = Leer.leerTexto("Introduce archivo que quieras modificar: ");
                    int Cantidad = Leer.leerEntero("Cantidad de enteros que quieres añadir en el archivo: ");
                    generarFicheroEnteros(archivo, Cantidad);
                    break;
                case 2:
                    String archivo1 = Leer.leerTexto("Introduce archivo que quieras modificar: ");
                    mostrarFicheroEnteros(archivo1);
                    break;
                case 3:
                    String archivo2 = Leer.leerTexto("Introduce archivo que quieras modificar: ");
                    int Cantidad2 = Leer.leerEntero("Cantidad de enteros que quieres añadir en el archivo: ");
                    añadirFicheroEnteros(archivo2, Cantidad2);
                    break;
                case 4:
                    System.out.println("FIN PROGRAMA");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }

        public static void generarFicheroEnteros (String archivo,int cant) throws IOException {
            try {
                File f = new File(archivo);
                RandomAccessFile raf = new RandomAccessFile(f, "rw");
                Random r = new Random(System.currentTimeMillis());
                int num;
                for (int i = 0; i < cant; i++) {
                    num = (int) (Math.random() * 100);
                    raf.write(num);
                }
                raf.close();
            } catch (FileNotFoundException f) {
                System.out.println(f.getMessage());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

        public static void mostrarFicheroEnteros (String archivo){
            try {
                File f = new File(archivo);
                RandomAccessFile raf = new RandomAccessFile(f, "r");
                long bytesLLegits = 0;
                long tam = raf.length();
                while (bytesLLegits < tam) {
                    int num = raf.read();
                    bytesLLegits += 4;
                    System.out.println(num + "\t");
                }
                System.out.println("");
                raf.close();
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        public static void añadirFicheroEnteros (String archivo,int cant) throws IOException {
            try {
                File f = new File(archivo);
                RandomAccessFile raf = new RandomAccessFile(f, "rw");
                Random r = new Random(System.currentTimeMillis());
                int num;
                raf.seek(raf.length());
                for (int i = 0; i < cant; i++) {
                    num = (int) Math.random() * 100 + 1;
                    raf.write(num);
                }
                raf.close();
            } catch (FileNotFoundException f) {
                System.out.println(f.getMessage());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
}
