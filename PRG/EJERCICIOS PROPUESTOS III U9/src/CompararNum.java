import java.util.Comparator;

public class CompararNum implements Comparator<Factura> {
    @Override
    public int compare(Factura f1, Factura f2) {
        return Integer.compare(f1.getNumero(), f2.getNumero());
    }
public static class ComparadorFechaImporte implements Comparator<Factura> {
    @Override
    public int compare(Factura f1, Factura f2) {
        int comparacionFecha = f1.getFecha().compareTo(f2.getFecha());
        if (comparacionFecha == 0) {
            return Float.compare(f1.getImporte(), f2.getImporte());
        }
        return comparacionFecha;
    }
}
public static class ComparadorImporteFecha implements Comparator<Factura> {
    @Override
    public int compare(Factura f1, Factura f2) {
        int comparacionImporte = Float.compare(f1.getImporte(), f2.getImporte());
        if (comparacionImporte == 0) {
            return f1.getFecha().compareTo(f2.getFecha());
        }
        return comparacionImporte;
        }
    }
}
