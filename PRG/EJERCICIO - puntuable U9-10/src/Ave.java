public abstract class Ave extends Animal {
    boolean pico;
    boolean vuela;

    public Ave(String codigo, int patas, int edad, String fecha_nacimiento) throws EdadNegativa{
        super(codigo, patas, edad, fecha_nacimiento);
    }

    public abstract String volar();
    public boolean isPico() {
        return pico;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setPico(boolean pico) {
        this.pico = pico;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }
}
