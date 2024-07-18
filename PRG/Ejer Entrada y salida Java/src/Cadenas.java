public class Cadenas {
    public static void ejer1() {
        String nombre = Leer.leerTexto("Cual es tu nombre? ");
        String sexo = Leer.leerTexto("Sexo(H/M): ");
        int tel = Leer.leerEntero("Cual es tu telefono: ");
        String ciudad = Leer.leerTexto("A que ciudad vas: ");
        if (sexo.equalsIgnoreCase("H"))
            System.out.println("<Hola! Soy el viajero " + nombre + " . Has llamado al " + tel + " y ahora no estoy en casa porque estoy en " + ciudad + " de vacaciones!!!");
        else if (sexo.equalsIgnoreCase("M"))
            System.out.println("<Hola! Soy la viajera " + nombre + " . Has llamado al " + tel + " y ahora no estoy en casa porque estoy en " + ciudad + " de vacaciones!!!");
        else
            System.out.println("Introduce un sexo valido.");
    }
    public static void ejer2() {
        String frase = Leer.leerTexto("Dime una frase: ");
        char vocal1 = Leer.leerTexto("Dime la vocal que quieres remplazar: ").charAt(0);
        char vocal2 = Leer.leerTexto("Dime la vocal que quieres remplazar por la vocal anterior: ").charAt(0);
        System.out.println("PRIMERA MANERA");
        System.out.println(frase.replace(vocal1,vocal2));
        System.out.println("SEGONA MANERA");
    for (int i = 0; i < frase.length(); i++) {
        if (frase.charAt(i) == vocal1)
            frase = frase.substring(0, i) + vocal2 + frase.substring(i + 1);
        }
        System.out.println(frase);
    }
}
