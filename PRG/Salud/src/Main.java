// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String usuario="A";
        do {
            String Nombre = Leer.leerTexto("Cual es tu nombre: ");
            String Apellidos = Leer.leerTexto("Cuales son tus apellidos: ");
            int edad = Leer.leerEntero("Cual es tu edad: ");
            double peso = Leer.leerDouble("Cual es tu peso en (kg): ");
            double altura = Leer.leerDouble("Cual es tu altura en (m): ");
            int telefono = Leer.leerEntero("Cual es tu telefono: ");
            System.out.println(Nombre + " " + Apellidos + " de " + edad + " de edad, los datos introducidos son correctos");
            double total = peso / (Math.pow(altura, 2));
            System.out.println("El telefono de contacto es " + telefono);
            System.out.println("Se ha registrado su altura " + altura + " y su peso " + peso);
            if (total < 18.5)
                System.out.println("Su IMC es: " + total + " Nivel: bajo");
            else if (total >= 18.5 && total < 24.9) {
                System.out.println("Su IMC es: " + total + " Nivel: Normal");
            } else if (total >= 24.9 && total < 29.9) {
                System.out.println("Su IMC es: " + total + " Nivel: Sobrepeso");
            } else if (total >= 30) {
                System.out.println("Su IMC es: " + total + " Nivel: obesidad");
            }
            System.out.println("--------------------------------------------");
            usuario = Leer.leerTexto("Quieres otro usuario (S/N): ");

        } while (usuario.equalsIgnoreCase("S"));
    }
}
