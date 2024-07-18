import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Departamento> departamentos = new ArrayList<>();


        departamentos.add(new Departamento("Ventes", 25));
        departamentos.add(new Departamento("Recursos Humans", 15));

        System.out.println("Llista de Departaments (sense ordenar):");
        for (Departamento depar : departamentos) {
            System.out.println(depar);
        }
        if (departamentos.get(0).esMayor(departamentos.get(1)))
            System.out.println("El departamento: " + departamentos.get(0) + " Es mayor que el Departamento: " + departamentos.get(1));
        else if (departamentos.get(0).esMenor(departamentos.get(1)))
            System.out.println("El departamento: " + departamentos.get(1) + " Es mayor que el Departamento: " + departamentos.get(0));
        else if (departamentos.get(0).esIgual(departamentos.get(1)))
            System.out.println(departamentos.get(0).compareTo(departamentos.get(1)));

        Collections.sort(departamentos);

        System.out.println("Llista de Departaments (ordenats per cantidad de empleats y nom):");
        for (Departamento depar : departamentos) {
            System.out.println(depar);
        }

    Factura factura1 = new Factura(101, new Date(2024, 3, 15), 500.0f);
    Factura factura2 = new Factura(102, new Date(2024, 3, 20), 700.0f);
    System.out.println();
    Comparator<Factura> comparadorImporteFecha = new CompararNum.ComparadorImporteFecha();
    Factura mayorPorImporteFecha = Collections.max(List.of(factura1, factura2), comparadorImporteFecha);
    System.out.println("Factura con mayor importe (y en caso de igualdad, por fecha):");
    System.out.println(mayorPorImporteFecha);

    ArrayList<Factura> facturas = new ArrayList<>();
        facturas.add(new Factura(201, new Date(2024, 3, 10), 600.0f));
        facturas.add(new Factura(202, new Date(2024, 3, 18), 400.0f));
        facturas.add(new Factura(203, new Date(2024, 3, 12), 800.0f));
        System.out.println();
        System.out.println("ArrayList de facturas sin ordenar:");
        for (Factura factura : facturas) {
        System.out.println(factura);
    }
        System.out.println();
        Collections.sort(facturas, new CompararNum());
        System.out.println("ArrayList de facturas ordenadas por número de factura:");
        for (Factura factura : facturas) {
        System.out.println(factura);
    }
        System.out.println();
        Collections.sort(facturas, new CompararNum.ComparadorFechaImporte());
        System.out.println("ArrayList de facturas ordenadas por fecha y luego por importe (en caso de igualdad):");
        for (Factura factura : facturas) {
        System.out.println(factura);
    }
        System.out.println();
        Collections.sort(facturas, new CompararNum.ComparadorImporteFecha());
        System.out.println("ArrayList de facturas ordenadas por importe y luego por fecha (en caso de igualdad):");
        for (Factura factura : facturas) {
        System.out.println(factura);
        }
    }
}