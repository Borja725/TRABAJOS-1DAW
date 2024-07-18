public abstract class Animal implements Comparable<Animal> {
    private String codigo;
    private int patas;
    private int edad;
    private String fecha_nacimiento;

    public Animal(String codigo, int patas, int edad, String fecha_nacimiento) throws EdadNegativa {
        this.codigo = codigo;
        this.patas = patas;
        this.edad = edad;
        if (edad<0){throw new EdadNegativa("La edad no puede ser negativa");}
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public abstract String aniversario();

    public abstract String habla();

    public String getCodigo() {
        return codigo;
    }

    public int getPatas() {
        return patas;
    }

    public int getEdad() {
        return edad;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    @Override
    public String toString() {
        return "Animal: " +
                "codigo: " + codigo +
                ", patas: " + patas +
                ", edad: " + edad +
                ", fecha_nacimiento: " + fecha_nacimiento;
    }

    @Override
    public int compareTo(Animal otroAnimal) {
        return Animal.this.codigo.compareTo(otroAnimal.getCodigo());
    }
}
