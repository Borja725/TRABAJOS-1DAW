public class Casa {
    private int nventanas;

    private int npuertas;

    private String color;

    public Casa(int nv, int np, String col) {
        this.nventanas = nv;
        this.npuertas = np;
        this.color = col;
    }
    public int getNventanas() {
        return nventanas;
    }

    public int getNpuertas() {
        return npuertas;
    }

    public void mostrarDatos() {
        System.out.println("La casa tiene " + this.getNpuertas() + " puertas y " + this.getNventanas() + " ventanas");
    }
}
