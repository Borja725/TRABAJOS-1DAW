public class Piso extends Casa {

    private int nplanta;

    private int balcons;

    public Piso(int nv, int np, String col, int npla, int balc) {
        super(nv, np, col);
        this.nplanta=npla;
        this.balcons=balc;
    }
    public int getBalcons() {
        return balcons;
    }

    public void mostrarDatos () {
        System.out.println("El piso tiene " + this.getNpuertas() + " puertas," + this.getNventanas() + " ventanas y " + this.getBalcons() + " balcones");
    }

    public String toString() {
        return "Piso - " + this.balcons + " balcones";
    }
}
