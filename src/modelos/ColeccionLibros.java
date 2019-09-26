package modelos;

import java.util.ArrayList;

public class ColeccionLibros {

    private ArrayList<Libro> libros;

    public ColeccionLibros() {
        this.libros = new ArrayList<Libro>();
    }

    public boolean agregar(Libro libro) {

        return this.libros.add(libro);
    }

    public boolean eliminar(String codigo) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getCodigo().equals(codigo)) {
                libros.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean modificar(Libro libro) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getCodigo().equals(libro.getCodigo())) {
                //libros.get(i).setCodigo(libro.getCodigo()); // optativo
                libros.get(i).setTitulo(libro.getTitulo());
                libros.get(i).setAutor(libro.getAutor());
                return true;
            }
        }
        return false;
    }

    public ArrayList<Libro> listar() {
        return this.libros;
    }

}
