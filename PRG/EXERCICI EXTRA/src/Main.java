// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int b5=0, b10=0, b20=0, b50=0, b100=0, b200=0, b500=0;
        int pregunta = Leer.leerEntero("Disme una cantitat de diners (multiple de 5): ");
        int a = pregunta%5;
        do {
            if (a == 0) {
                if (pregunta == 5) {
                    int resul = pregunta % 5;
                    b5 += 1;
                    pregunta-=5;
                    System.out.println(b5 + " billet de 5");
                } else if ( pregunta >=10 && pregunta < 20); {
                    int resul = pregunta%5;
                    b10+=1;
                    pregunta-=10;
                    System.out.println(b10 + " billet de 10");
                }
            } else
                System.out.println("Introduix un valor valid.");
        } while (pregunta != 0);



    }
}