public class Programa2 {
    public static void main(String[] args) {
        String palabras[] = new String[25];
        System.out.println("Programa 2.");
        try {
            System.out.println("La primera palabra es " + palabras[-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index negatiu");
        }

        try {
            System.out.println("La primera letra de la primera palabra es " +
                    palabras[0].charAt(0));
        } catch (NullPointerException e) {
            System.out.println("Error perque es null");
        }
    }
}

