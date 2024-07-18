public class Coche2mano extends Coche{

    private int Km;
    private int anios;


    public Coche2mano(int numBastidor, String marca, String modelo, String matricula, String color, double precio, int km, int anios) {
        super(numBastidor, marca, modelo, matricula, color, precio);
        this.Km = km;
        this.anios = anios;
    }

    public int getKm() {
        return Km;
    }

    public void setKm(int km) {
        Km = km;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    public void mostrarInfo() {
        System.out.println("Numero de Bastidor - " + this.getNumBastidor());
        System.out.println("Marca - " + this.getMarca());
        System.out.println("Modelo - " + this.getModelo());
        System.out.println("Matricula - " + this.getMatricula());
        System.out.println("Color - " + this.getColor());
        System.out.println("Precio - " + this.getPrecio());
        System.out.println("Km - " + this.getKm());
        System.out.println("Años - " + this.getAnios());
    }

    @Override
    public String toString(){
        return "Coche2mano - MATRICULA " + this.getMatricula() + " Marca " + this.getMarca() + " Modelo " + this.getModelo();
    }
}
