package modelos;

public class Libro {

    private String codigo;
    private String titulo;
    private String autor;
    private int edicion;
    private int numcopias;

    public Libro() {
    }

    public Libro(String codigo, String titulo, String autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
    }

    public Libro(String codigo, String titulo, String autor, int edicion, int numcopias) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.edicion = edicion;
        this.numcopias = numcopias;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public int getNumcopias() {
        return numcopias;
    }

    public void setNumcopias(int numcopias) {
        this.numcopias = numcopias;
    }

}
