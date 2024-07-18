/**
 *
 * @author Borja Pellicer Moncho - 20941385
 * 26/02/2024
 *
 */
class eBook {
    int ISBN;
    String titulo;
    double tamaño;
    String editorial;
    String audible;
    String autor;

    public eBook(String edi, String aut) {
        this.editorial = edi;
        this.autor = aut;
    }

    public eBook(int ISBN, String titulo, float tamaño ,String editorial, String audible, String autor) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.tamaño = tamaño;
        this.editorial = editorial;
        this.audible = audible;
        this.autor = autor;
    }

    public eBook(int ISBN, String titulo, float tamaño) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.tamaño = tamaño;
    }

    public eBook() {

    }
}
