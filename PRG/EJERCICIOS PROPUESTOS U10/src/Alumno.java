public class Alumno {
    public static final int CEVA = 3;
    public static final int CEJER = 5;
    private double notas[][];
    private int id;
    private String nom;

    public Alumno(int id, String nom) {
        this.id = id;
        this.nom = nom;
        notas = new double[CEVA][CEJER];
    }

    public Alumno() {
        notas = new double[CEVA][CEJER];
    }


public void ponerNota(int ava, int exer, double nota)
        throws EvaluacioIncorrectaException, EjercicioIncorrectoException {

    if (ava<=0)
        throw new EvaluacioIncorrectaException("La evaluacion no puede ser negativa");
    if (ava>=CEVA)
        throw new EvaluacioIncorrectaException("La evaluacion no puede ser superior a " + CEVA);
    if (exer<=0)
        throw new EjercicioIncorrectoException("El ejercicio no puede ser negativa");
    if (exer>=CEJER)
        throw new EjercicioIncorrectoException("El ejercicio no puede ser superior a " + CEVA);

    notas[ava][exer]=nota;
    }


    @Override
    public String toString() {
        StringBuilder cad= new StringBuilder();
        for (int i=0;i<CEVA;i++){
            cad.append("\nEvaluacion: " + (i+1));
            for (int j=0;j<CEJER;j++){
                cad.append(" Ejer " + (j+1) + ": " + notas[i][j]).append(" - ");
            }
        }

        return "ALUMNO: " + nom + " ID: " + id + "  " + cad.toString();
    }
}
