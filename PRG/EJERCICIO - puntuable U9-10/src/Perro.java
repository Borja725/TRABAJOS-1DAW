public class Perro extends Animal implements Mascota{

    String nombre;
    String raza;
    boolean desparasitado;
    int num_vacunas;

    public Perro(String codigo, int patas, int edad, String fecha_nacimiento, String nombre, String raza, boolean desparasitado, int num_vacunas) throws EdadNegativa {
        super(codigo, patas, edad, fecha_nacimiento);
        this.nombre = nombre;
        this.raza = raza;
        this.desparasitado = desparasitado;
        this.num_vacunas = num_vacunas;
    }

    public String habla() {
        return "GUAU, GUAU";
    }

    public void vacunar() {
        num_vacunas+=1;
        desparasitado=true;
    }
    public String getRaza() {
        return raza;
    }

    public boolean isDesparasitado() {
        return desparasitado;
    }

    public int getNum_vacunas() {
        return num_vacunas;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setDesparasitado(boolean desparasitado) {
        this.desparasitado = desparasitado;
    }

    public void setNum_vacunas(int num_vacunas) {
        this.num_vacunas = num_vacunas;
    }

    public String aniversario() {
        int edadactual = getEdad();
        setEdad(edadactual+1);
        return "La edad del gos es: " + getEdad() + " i la equivalencia als humans seria: " + getEdad()*7 + " anys";
    }



    @Override
    public String toString() {
        return super.toString() + " Perro: " + "Nombre: " + nombre + " raza: "  + raza +
                ", desparasitad: " + desparasitado +
                ", num_vacunas: " + num_vacunas + " edad: "
                + aniversario();
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void jugar(String nombre) {
        System.out.println("Dame la pata");
        System.out.println("Coge el palo");
    }
}
