import java.io.*;

public class Programa3 {
    public static void main(String[] args) throws IOException {
                String archiu = "C:\\Users\\borpelmon\\provafile\\Ejercicio3.txt";
                FileWriter fw = null;
                BufferedWriter bw = null;
                fw = new FileWriter(archiu);
                bw = new BufferedWriter(fw);
                String nombre="";
                String numero="";
                while (!numero.equalsIgnoreCase("Fin") || !nombre.equalsIgnoreCase("Fin")) {
                    nombre = Leer.leerTexto("Introduce el nombre que quieres introducir (Fin para finalizar): ");
                    if (nombre.equalsIgnoreCase("Fin"))
                        break;
                    numero = Leer.leerTexto("Introduce el numero de telefono de "+ nombre + " (Fin para finalizar): ");
                    if (numero.equalsIgnoreCase("Fin"))
                        break;
                    bw.write(nombre + " - " + numero);
                    bw.newLine();
                }
                bw.close();
                fw.close();
                String pregunta = Leer.leerTexto("Quieres ver el contenido del archivo? ");
                if (pregunta.equalsIgnoreCase("si")) {
                    FileReader fr = new FileReader(archiu);
                    BufferedReader br = new BufferedReader(fr);
                    String s="";
                    while ( br.ready() ) {
                        s = br.readLine();
                        System.out.println( s );
                        }
                    br.close();
                    fr.close();
                }
            }
        }
