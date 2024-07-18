public class Adosado extends Casa {

    private int npcocheres;

    private boolean pati;

    public Adosado (int nv, int np, String col, int npcoche, boolean pati) {
        super(nv, np, col);
        this.npcocheres=npcoche;
        this.pati=pati;
    }

    public int getNpcocheres() {
        return npcocheres;
    }

    public void mostrarDatos() {
        if (this.pati) {
            System.out.println("El Adosado tiene " + this.getNpuertas() + " puertas y " + this.getNventanas() + " ventanas," + this.getNpcocheres() + " plaza de cochera y patio");
        } else
            System.out.println("El Adosado tiene " + this.getNpuertas() + " puertas y " + this.getNventanas() + " ventanas," + this.getNpcocheres() + " plaza de cochera pero no tiene patio");
    }

    public String toString() {
        String infoPatio = this.pati ? " y patio" : " pero no tiene patio";
        return "Adosado - Cochera" + infoPatio;
    }
}
