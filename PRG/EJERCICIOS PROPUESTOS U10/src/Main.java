import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static ArrayList<Alumno> alumnos = new ArrayList<>();

    public static void main(String[] args) {
        boolean seguir = true;
        int id;
        Alumno al;
        do {
            System.out.println("1.Nuevo Alumno");
            System.out.println("2.Poner Nota");
            System.out.println("3.Mostrar lista de notas de un alumno");
            System.out.println("4.Salir");
            int opcion = Leer.leerEntero("Introduce una opcion: ");

            switch (opcion) {
                case 1:
                    String nombre = Leer.leerTexto("Introduce el nombre del alumno: ");
                    newAlumno(nombre);
                    break;
                case 2:
                    Alumno alum;
                    for (Alumno alu : alumnos)
                        System.out.println(alu);
                    int opcalumno = Leer.leerEntero("Introduce el numero de alumno que quieras: (de 0-∞) ");
                    alum = alumnos.get(opcalumno);
                    int ava = Leer.leerEntero("Introduce el numero de la avaluacion: ");
                    int exer = Leer.leerEntero("Introduce el numero de exercicio: ");
                    double nota = Leer.leerDouble("Introduce la nota: ");
                    try {
                        alum.ponerNota(ava-1,exer-1,nota);
                    } catch ( EjercicioIncorrectoException | EvaluacioIncorrectaException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.println("Notas de los alumnos: ");
                    for (Alumno alumno : alumnos) {
                        System.out.println(alumno);
                    }
                    break;
                case 4:
                    seguir = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (seguir);
    }


    public static void newAlumno(String al){
        int id = Leer.leerEntero("Introduce el id del alumno: ");
        Alumno alumno= new Alumno(id,al);
        alumnos.add(alumno);
    }

}

