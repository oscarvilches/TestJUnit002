package testjunit002;

import java.util.ArrayList;
import modelos.ColeccionLibros;
import modelos.Libro;

public class TestJUnit002 {

    public static void listarLibros(ArrayList<Libro> lista) {
        for (Libro obj : lista) {
            System.out.println("Codigo: " + obj.getCodigo());
            System.out.println("Titulo: " + obj.getTitulo());
            System.out.println("Autor: " + obj.getAutor());
            System.out.println("--------");
        }
    }

    public static void main(String[] args) {

        ColeccionLibros lista = new ColeccionLibros();
        Libro libro;
        String codigo;

        libro = new Libro("Libro1", "Titulo1", "Autor1");
        lista.agregar(libro);
        libro = new Libro("Libro2", "Titulo2", "Autor2");
        lista.agregar(libro);
        libro = new Libro("Libro3", "Titulo1", "Autor1");
        lista.agregar(libro);
        
        System.out.println("***");
        listarLibros(lista.listar());

        libro = new Libro("Libro3", "Titulo3", "Autor3");
        lista.modificar(libro);
        
        System.out.println("***");
        listarLibros(lista.listar());
        
        codigo ="Libro2";
        lista.eliminar(codigo);
        
        System.out.println("***");
        listarLibros(lista.listar());
    }
}
