public class Coche {

    private boolean []Revisiones ={false,false,false,false,false};
    private int numBastidor;
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double precio;
    private boolean revisar=true;

    public Coche(int numBastidor, String matricula, String marca, String modelo, String color, double precio) {
        this.numBastidor = numBastidor;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }

    public int getNumBastidor() {
        return numBastidor;
    }

    public void setNumBastidor(int numBastidor) {
        this.numBastidor = numBastidor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isRevisar() {
        return revisar;
    }

    public void setRevisar(boolean revisar) {
        this.revisar = revisar;
    }

    public boolean[] getRevisiones() {
        return Revisiones;
    }

    public void setRevisiones(boolean[] revisiones) {
        Revisiones = revisiones;
    }

    public void aumentarPrecioPorcentaje (int porcentaje) {
        double sumaprecio = porcentaje * precio / 100;
        this.precio = precio + sumaprecio;
    }

    public void mostrarInfo() {
        System.out.println("Numero de Bastidor - " + this.getNumBastidor());
        System.out.println("Marca - " + this.getMarca());
        System.out.println("Modelo - " + this.getModelo());
        System.out.println("Matricula - " + this.getMatricula());
        System.out.println("Color - " + this.getColor());
        System.out.println("Precio - " + this.getPrecio());
    }
    @Override
    public String toString(){
        return "Coche - MATRICULA " + this.getMatricula() + " Marca " + this.getMarca() + " Modelo " + this.getModelo();
    }


}
