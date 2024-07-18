import java.io.*;
import java.util.ArrayList;

public class Agenda implements Serializable {
    private static ArrayList<Contacto> listaContactos = new ArrayList<>();
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int opc = 1;
        importarContactos();
            while (opc != 0) {
                System.out.println("\n----------- M E N U -----------");
                System.out.println("\n1. Dar de alta un contacto");
                System.out.println("2. Consultar un contacto por su nombre");
                System.out.println("3. Saber la cantidad de amigos grabados");
                System.out.println("4. Mostrar toda la agenda por pantalla");
                System.out.println("5. Borrar un contacto");
                System.out.println("6. Modificar los datos de un contacto");
                System.out.println("7. Importar Contactos");
                System.out.println("8. Exportar Contactos");
                System.out.println("0. Salir");
                opc = Leer.leerEntero("Selecciona una opción: ");
                switch (opc) {
                    case 1:
                        darAlta();
                        break;
                    case 2:
                        String nombre = Leer.leerTexto("Introduce el nombre del contacto que quieres consultar: ");
                        consultarContacto(nombre);
                        break;
                    case 3:
                        cantAmigos();
                        break;
                    case 4:
                        mostrarAgenda();
                        break;
                    case 5:
                        mostrarAgenda();
                        String nombre1 = Leer.leerTexto("Contacto que quieres eliminar: ");
                        borrarContacto(nombre1);
                        break;
                    case 6:
                        mostrarAgenda();
                        String nombre2 = Leer.leerTexto("Introduce el nombre del contacto que quieres modificar: ");
                        modificarContacto(nombre2);
                        break;
                    case 7:
                        importarContactos();
                        break;
                    case 8:
                        exportarContactos();
                        break;
                    case 0:
                        System.out.println("SALIENDO DEL PROGRAMA...");
                        exportarContactos();
                        break;
                    default:
                        System.out.println("opcion no valida");
                        break;
                }
            }
        }



    public static void darAlta() throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\borpelmon\\provafile\\contactos.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        String nombre = "";
        String numero = "";
        nombre = Leer.leerTexto("Introduce el nombre que quieres introducir: ");
        numero = Leer.leerTexto("Introduce el numero de telefono de " + nombre + ": ");
        oos.writeObject(new Contacto(nombre, numero));
        Contacto c = new Contacto(nombre, numero);
        listaContactos.add(c);

        oos.close();
        fos.close();
    }


    public static void consultarContacto(String nombre) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("C:\\Users\\borpelmon\\provafile\\contactos.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Contacto cont = (Contacto) ois.readObject();
        if (nombre.equalsIgnoreCase(cont.getNombre())) {
            System.out.println(cont.getNombre() + " - " + cont.getTelefono());
        }
        ois.close();
        fis.close();
    }

    public static void cantAmigos() {
        System.out.println("Total de amigos en la lista: " + listaContactos.size());
    }

    public static void mostrarAgenda() {
        for (Contacto c : listaContactos) {
            System.out.println(c);
        }
    }

    public static void borrarContacto(String nombre)  {
        listaContactos.removeIf(cont -> nombre.equalsIgnoreCase(cont.getNombre()));
    }

    public static void modificarContacto(String nombre) {
        for (Contacto c : listaContactos){
            if (nombre.equalsIgnoreCase(c.getNombre())) {
                String opcion = Leer.leerTexto("Que quieres modificar? (Nombre/Telefono) ");
                if (opcion.equalsIgnoreCase("Nombre")){
                    String nombreCambiar = Leer.leerTexto("Introduce el nuevo nombre: ");
                    c.setNombre(nombreCambiar);
                } else if (opcion.equalsIgnoreCase("Telefono")) {
                    String telefonoCambiar = Leer.leerTexto("Introduce el nuevo numero de telefono: ");
                    c.setTelefono(telefonoCambiar);
                } else {
                    System.out.println("Opcion no valida");
                }
            }
        }
    }

    public static void importarContactos() throws IOException, ClassNotFoundException {
        File d = new File("C:\\Users\\borpelmon\\provafile\\contactos.txt");
        if (d.length() == 0) {
            return;
        } else {
            FileInputStream fiis = new FileInputStream(d);
            ObjectInputStream oiis = new ObjectInputStream(fiis);
            while (fiis.available() > 0) {
                Contacto contact = (Contacto) oiis.readObject();
                listaContactos.add(contact);
            }
            oiis.close();
            fiis.close();
        }
    }


    public static void exportarContactos() throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\borpelmon\\provafile\\contactos.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for (Contacto contArray : listaContactos) {
            oos.writeObject(contArray);
        }
        oos.close();
        fos.close();
    }
}




