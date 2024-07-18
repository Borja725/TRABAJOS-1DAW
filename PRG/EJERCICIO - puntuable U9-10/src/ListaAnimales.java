import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class ListaAnimales {
    private static ArrayList<Animal> listAnimales = new ArrayList<>();
    public static void main(String[] args) throws EdadNegativa {
        boolean seguir = true;
        int opc;
        do {
            System.out.println("1-Mostrar la lista de animales (sólo el tipo de animal y código).");
            System.out.println("2-Ordenar la lista por un criterio.");
            System.out.println("3-Mostrar todos los datos de un animal.");
            System.out.println("4-Insertar nuevos animales en la lista");
            System.out.println("5-Eliminar animales de la lista.");
            System.out.println("6-Ordenar la lista de animales por 2 criterios");
            System.out.println("7-Alta de mascota (asignando el nombre a un animal de la lista, susceptible de ser una mascota)");
            System.out.println("8-Salir");
            opc = Leer.leerEntero("Introduce la opcion: ");
            switch (opc) {
                case 1:
                    System.out.println("Lista animales(tipo y codigo): ");
                    ListaAnimales();
                    break;
                case 2:
                    System.out.println("lista ordenada por un criterio: ");
                    Collections.sort(listAnimales);
                    for (Animal anim : listAnimales) {
                        System.out.println(anim);
                    }
                    break;
                case 3:
                    System.out.println("Buscar un animal: ");
                    String datos = Leer.leerTexto("Introduce el animal que quieres mostrar todos los datos: ");
                    buscarAnimal(datos);
                    break;
                case 4:
                    System.out.println("Añadir un animal: ");
                    String animal = Leer.leerTexto("Introduce el tipo de animal que quieres añadir: (Perro,Loro): ");
                    try {
                        añadirAnimal(animal);
                    } catch ( EdadNegativa e) {
                        System.out.println(e);
                    }
                        break;
                case 5:
                    System.out.println("Eliminar un animal: ");
                    ListaAnimales();
                    String eliminaranimal = Leer.leerTexto("Introduce el codigo del animal que quieres eliminar de la lista: ");
                    eliminarAnimal(eliminaranimal);
                    break;
                case 6:
                    System.out.println("Lista ordenada por 2 criterios: ");
                    listAnimales.sort(new CompararMultiple());
                    for (Animal anima : listAnimales) {
                        System.out.println(anima);
                    }
                    break;
                case 7:
                    for (int i = 0;i < listAnimales.size();i++) {
                        System.out.println((i+1) + "- " + listAnimales.get(i));
                    }
                    int seleccion = Leer.leerEntero("Introduce el numero del animal de la lista que quieres modifciar: ");
                    modificarAnimal(seleccion-1);
                    break;
                case 8:
                    System.out.println("FIN DEL PROGRAMA!");
                    seguir = false;
                    break;
            }
        } while (seguir);

    }
    public static void ListaAnimales() {
        for (Animal animal : listAnimales) {
            System.out.println(animal.getClass().getName());
            System.out.println(animal.getCodigo());
        }
    }

    public static void buscarAnimal(String datos) {
        for (Animal animal : listAnimales) {
            if (datos.equalsIgnoreCase(animal.getClass().getName())) {
                System.out.println(animal);
            }
        }
    }
    public static void añadirAnimal(String animal) throws EdadNegativa {
        if (animal.equalsIgnoreCase("Perro")) {
            String codigo = Leer.leerTexto("Introduce el codigo del perro: ");
            int patas = Leer.leerEntero("Introduce el numero de patas: ");
            int edad = Leer.leerEntero("Introduce la edad del perro: ");
            String fecha = Leer.leerTexto("Introduce la fecha de nacimiento del perro: ");
            String nombre = Leer.leerTexto("Introduce el nombre del perro: ");
            String raza = Leer.leerTexto("Introduce la raza del perro: ");
            String vacuna = Leer.leerTexto("Esta vacunado? ");
            boolean desparasitado;
            int numVacunas = 0;
            if (vacuna.equalsIgnoreCase("Si")) {
                numVacunas = Leer.leerEntero("Introduce el numero de vacunas: ");
                desparasitado = true;
            } else {
                desparasitado = false;
            }
            Perro per;
            per = new Perro(codigo,patas,edad,fecha,nombre,raza,desparasitado,numVacunas);
            listAnimales.add(per);
        } else if (animal.equalsIgnoreCase("Loro")) {
            String codigo = Leer.leerTexto("Introduce el codigo del Loro: ");
            int patas = Leer.leerEntero("Introduce el numero de patas: ");
            int edad = Leer.leerEntero("Introduce la edad del Loro: ");
            String fecha = Leer.leerTexto("Introduce la fecha de nacimiento del Loro: ");
            String nombre = Leer.leerTexto("Introduce el nombre del Loro: ");
            String tipo = Leer.leerTexto("Introduce el tipo de Loro: ");
            String hablar = Leer.leerTexto("El loro habla? ");
            boolean habla;
            if (hablar.equalsIgnoreCase("Si")) {
                habla = true;
            } else {
                habla = false;
            }
            Loro lr;
            lr = new Loro(codigo,patas,edad,fecha,nombre,tipo,habla);
            listAnimales.add(lr);
        }
        else {
            System.out.println("Animal no valido");
        }
    }
    public static void eliminarAnimal(String eliminaranimal) {
        for (int i = 0;i < listAnimales.size();i++) {
            if (listAnimales.get(i).getCodigo().equalsIgnoreCase(eliminaranimal))
                listAnimales.remove(listAnimales.get(i));
        }
    }

    public static void modificarAnimal(int seleccion) {
        if (listAnimales.get(seleccion) instanceof Perro) {
            System.out.println("Modificando el nombre del Perro");
            String nombreP = Leer.leerTexto("Introduce el nombre del Perro: ");
            ((Perro) listAnimales.get(seleccion)).setNombre(nombreP);
        } else if (listAnimales.get(seleccion) instanceof Loro) {
            System.out.println("Modificando el nombre del Loro");
            String nombreL = Leer.leerTexto("Introduce el nombre del Loro: ");
            ((Loro) listAnimales.get(seleccion)).setNombre(nombreL);
        }
    }
}
