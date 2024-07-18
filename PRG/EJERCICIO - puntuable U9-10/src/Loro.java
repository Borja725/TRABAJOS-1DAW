public class Loro extends Ave implements Mascota{

    String nombre;
    String tipo;
    boolean habla;

    public Loro(String codigo, int patas, int edad, String fecha_nacimiento, String nombre, String tipo, boolean habla) throws EdadNegativa {
        super(codigo, patas, edad, fecha_nacimiento);
        this.nombre = nombre;
        this.tipo = tipo;
        this.habla = habla;
    }


    public String getTipo() {
        return tipo;
    }

    public boolean isHabla() {
        return habla;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setHabla(boolean habla) {
        this.habla = habla;
    }

    public void saluda() {
        System.out.println(" HOLA, HOLA");
    }

    public String volar() {
        return "se desplaza 3 metros";
    }

    public String habla() {
        habla=true;
        return "Siuuuu";
    }

    public String aniversario() {
        int edadact = getEdad();
        setEdad(edadact+1);
        return "La edad del loro es: " + getEdad() + " i la equivalencia als humans seria: " + getEdad()*10 + " anys";
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
        System.out.println("Saluda a quien pase");
    }

    @Override
    public String toString() {
        return super.toString() + " Loro: " +
                "nombre " + nombre +
                ", tipo: " + tipo +
                ", habla: " + habla + " " +
                aniversario();
    }
}
