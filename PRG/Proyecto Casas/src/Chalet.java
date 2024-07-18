public class Chalet extends Casa {
    private int mantener;

    private int mjardin;

    private String colorValla;

    public Chalet(int nv, int np, String col, int mant, int mj, String colV) {
        super(nv, np, col);
        this.mantener = mant;
        this.mjardin = mj;
        this.colorValla = colV;
    }

    public void aumentaMantener(){
        this.mantener*=1.02;
    }

    public void pintarChalet(String nuevocolor) {
        this.colorValla=nuevocolor;
    }

    public int getMjardin() {
        return mjardin;
    }

    public void mostrarDatos () {
        System.out.println("El chalet tiene " + this.getNpuertas() + " puertas," + this.getNventanas() + " ventanas y " + this.getMjardin() + " m2 de jardin");
    }

    @Override
    public String toString() {
        return "Chalet - Color de la valla: " + colorValla;
    }
}
