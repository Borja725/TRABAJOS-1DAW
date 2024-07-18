import java.util.Date;

public class Factura {
    int numero;
    Date fecha;
    float importe;

    public Factura(int numero, Date fecha, float importe) {
        this.numero = numero;
        this.fecha = fecha;
        this.importe = importe;
    }

    public int getNumero() {
        return numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public float getImporte() {
        return importe;
    }


    @Override
    public String toString() {
        return "Factura: " +
                "numero: " + numero +
                ", fecha: " + fecha +
                ", importe: " + importe;
    }
}
