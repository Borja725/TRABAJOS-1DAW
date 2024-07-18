import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Programa2 {
    public static void main(String[] args) throws IOException {

        String archiu = "C:\\Users\\borpelmon\\provafile\\Ejercicio2.txt";
        FileWriter fw = null;
        BufferedWriter bw = null;
            fw = new FileWriter(archiu);
            bw = new BufferedWriter(fw);
            String frase="";
            while (!frase.equalsIgnoreCase("Fin")) {
                frase = Leer.leerTexto("Introduce la frase que quieres introducir: ");
                if (frase.equalsIgnoreCase("Fin"))
                    break;
                bw.write(frase);
                bw.newLine();
            }
            bw.close();
            fw.close();
    }
}

