public class Departamento implements Comparable<Departamento> {

    String Nombre;
    int cantEmpleados;

    public Departamento(String nombre, int cantEmpleados) {
        this.Nombre = nombre;
        this.cantEmpleados = cantEmpleados;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getCantEmpleados() {
        return cantEmpleados;
    }

    public boolean esMayor(Departamento otroDepartamento) {
        return this.cantEmpleados > otroDepartamento.getCantEmpleados();
    }

    public boolean esMenor(Departamento otroDepartamento) {
        return this.cantEmpleados < otroDepartamento.getCantEmpleados();
    }

    public boolean esIgual(Departamento otroDepartamento) {
        return this.cantEmpleados == otroDepartamento.getCantEmpleados();
    }
    public String toString() {
        return "Departament - " +
                "nom: " + Nombre +
                ", cantitat de Empleats: " + cantEmpleados;
    }

    @Override
    public int compareTo(Departamento o) {
        return 0;
    }
}
