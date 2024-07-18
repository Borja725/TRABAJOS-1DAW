public class Main {
    public static void main(String[] args) {
        System.out.println("Programa 1.");
        System.out.println("Instrucción 1.");

        try {
            int n = Integer.parseInt("M");
        } catch (NumberFormatException e) {
            System.out.println("No es un valor numeric");
        }
        System.out.println("Instrucción 2.");
    }
}