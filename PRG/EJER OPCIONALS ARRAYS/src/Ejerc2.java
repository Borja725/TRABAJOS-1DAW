public class Ejerc2 {
    public static void main(String[] args) {
        int edades[] = new int[10];
        for (int i = 0; i < edades.length; i++) {
            edades[i] = i + 1;
        }


        for (int i = 0; i < edades.length; i++) {
            edades[i]= Leer.leerEntero("Quina edad tens? ");
        }

        int numero = Leer.leerEntero("Introduce el numero de alumno: (0-9) ");
        if (numero<0 || numero>9)
            System.out.println("Introduix un valor valid");
        else
            System.out.println("El alumne " + numero + " Te " + edades[numero] + " Anys");

        int a = Leer.leerEntero("De que alumnos quieres calcular la edad total: (ejemplo: 4) ");
        int b=0;
        for (int i = 0; i < a; i++) {
             b+=edades[i];
        }
        System.out.println("La edat total es: " + b);

    }
}
