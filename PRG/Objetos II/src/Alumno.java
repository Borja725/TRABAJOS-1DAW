public class Alumno {
    private String nombre;
    private int num;
    private int edad;
    private int curso;

    public Alumno() {
        this.nombre = "";
        this.num = 0;
        this.edad = 0;
        this.curso = 0;
    }

    public Alumno(String nombre, int num, int edad, int curso) {
        this.nombre = nombre;
        this.num = num;
        this.edad = edad;
        this.curso = curso;
    }

    public Alumno(Alumno otroAlumno) {
        this.nombre = otroAlumno.nombre;
        this.num = otroAlumno.num;
        this.edad = otroAlumno.edad;
        this.curso = otroAlumno.curso;
    }

    public void leerAlumno() {
        this.nombre = Leer.leerTexto("Introduce el nombre del alumno:");
        this.num = Leer.leerEntero("Introduce el número del alumno:");
        this.edad = Leer.leerEntero("Introduce la edad del alumno:");
        this.curso = Leer.leerEntero("Introduce el curso del alumno:");
    }

    public void imprimirAlumno() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Número: " + this.num);
        System.out.println("Edad: " + this.edad);
        System.out.println("Curso: " + this.curso);
    }

    public void copiarAlumno(Alumno otroAlumno) {
        this.nombre = otroAlumno.nombre;
        this.num = otroAlumno.num;
        this.edad = otroAlumno.edad;
        this.curso = otroAlumno.curso;
    }

    public boolean igualAlumno(Alumno otroAlumno) {
        return this.nombre.equals(otroAlumno.nombre) &&
                this.num == otroAlumno.num &&
                this.edad == otroAlumno.edad &&
                this.curso == otroAlumno.curso;
    }
}

