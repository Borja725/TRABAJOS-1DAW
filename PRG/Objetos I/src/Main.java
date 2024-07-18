import java.io.BufferedReader;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("MENU");
        System.out.println("1- Classe Punto");
        System.out.println("2- Classe Persona");
        System.out.println("3- Classe Rectangulo");
        System.out.println("-1 Salir");
        int opcion = Leer.leerEntero("Dime un numero: ");
        while (opcion != -1 ) {
            switch (opcion) {
                case 1:
                    probarPunto();
                    break;
                case 2:
                    probarPersona();
                    break;
                case 3:
                    probarRectangulo();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }

    public static void probarPunto() {
        Punto prueba = new Punto(5, 0);
        Punto prueba2 = new Punto(10,10);
        Punto prueba3 = new Punto(-3, 7);
        System.out.println("Prueba1");
        System.out.println(prueba);
        System.out.println("Prueba2");
        System.out.println(prueba2);
        System.out.println("Prueba3");
        System.out.println(prueba3);
        modificarPunto();
    }

    public static void modificarPunto() {
        Punto prueba = new Punto(-9, 5);
        Punto prueba2 = new Punto(-12,4);
        Punto prueba3 = new Punto(-3, -6);
        System.out.println("Prueba1 modificada");
        System.out.println(prueba);
        System.out.println("Prueba2 modificada");
        System.out.println(prueba2);
        System.out.println("Prueba3 modificada");
        System.out.println(prueba3);
    }

    public static void probarPersona() {
        int dni1 = 0;
        String nombre1 = null;
        String apellidos1 = null;
        int edad1 = 0;
        Persona persona1 = new Persona(dni1, nombre1, apellidos1, edad1);
        dni1 = persona1.dni = Leer.leerEntero("Introduce el dni de la persona1: ");
        nombre1 = persona1.nombre = Leer.leerTexto("Introduce el nombre de la persona1: ");
        apellidos1 = persona1.apellidos = Leer.leerTexto("Introduce el apellido de la persona1: ");
        edad1 = persona1.edad = Leer.leerEntero("Introduce la edad de la persona1: ");
        if (edad1 >= 18)
            System.out.println(nombre1 + apellidos1 + " con dni: " + dni1 + " es mayor de edad");
        else
            System.out.println(nombre1 + apellidos1 + " con dni: " + dni1 + " no es mayor de edad");

        int dni2 = 0;
        String nombre2 = null;
        String apellidos2 = null;
        int edad2 = 0;
        Persona persona2 = new Persona(dni2, nombre2, apellidos2, edad2);
        dni2 = persona2.dni = Leer.leerEntero("Introduce el dni de la persona2: ");
        nombre2 = persona2.nombre = Leer.leerTexto("Introduce el nombre de la persona2: ");
        apellidos2 = persona2.apellidos = Leer.leerTexto("Introduce el apellido de la persona2: ");
        edad2 = persona2.edad = Leer.leerEntero("Introduce la edad de la persona2: ");
        if (edad2 >= 18)
            System.out.println(nombre2 + apellidos2 + " con dni " + dni2 + " es mayor de edad");
        else
            System.out.println(nombre2 + apellidos2 + " con dni " + dni2 + " no es mayor de edad");
    }

    public static void probarRectangulo() {
        Rectangulo Rectangulo1 = new Rectangulo(0,0,5,5);
        Rectangulo Rectangulo2 = new Rectangulo(7,9,2,3);
        System.out.println("Rectangulo1");
        System.out.println(Rectangulo1);
        int perimetro1 = Rectangulo1.x1 + Rectangulo1.y1 + Rectangulo1.x2 + Rectangulo1.y2;
        System.out.println("Perimetro1");
        System.out.println(perimetro1);
        int area1 = Rectangulo1.x1 * Rectangulo1.y1 + Rectangulo1.x2 * Rectangulo1.y2;
        System.out.println("Area2");
        System.out.println(area1);
        System.out.println("Rectangulo2");
        System.out.println(Rectangulo2);
        int perimetro2 = Rectangulo2.x1 + Rectangulo2.y1 + Rectangulo2.x2 + Rectangulo2.y2;
        System.out.println("Perimetro2");
        System.out.println(perimetro2);
        int area2 = Rectangulo2.x1 * Rectangulo2.y1 + Rectangulo2.x2 * Rectangulo2.y2;
        System.out.println("Area2");
        System.out.println(area2);
        modificarRectangulo();
    }

    public static void modificarRectangulo() {
        Rectangulo Rectangulo1 = new Rectangulo(4,8,2,1);
        Rectangulo Rectangulo2 = new Rectangulo(1,2,3,6);
        System.out.println("Rectangulo1 modificado");
        System.out.println(Rectangulo1);
        int perimetro1 = Rectangulo1.x1 + Rectangulo1.y1 + Rectangulo1.x2 + Rectangulo1.y2;
        System.out.println("Perimetro1 modificado");
        System.out.println(perimetro1);
        int area1 = Rectangulo1.x1 * Rectangulo1.y1 + Rectangulo1.x2 * Rectangulo1.y2;
        System.out.println("Area2 modificada");
        System.out.println(area1);
        System.out.println("Rectangulo2 modificado");
        System.out.println(Rectangulo2);
        int perimetro2 = Rectangulo2.x1 + Rectangulo2.y1 + Rectangulo2.x2 + Rectangulo2.y2;
        System.out.println("Perimetro2 modificado");
        System.out.println(perimetro2);
        int area2 = Rectangulo2.x1 * Rectangulo2.y1 + Rectangulo2.x2 * Rectangulo2.y2;
        System.out.println("Area2 modificada");
        System.out.println(area2);
    }

}