
package modelos;

import org.junit.Assert;
import org.junit.Test;


public class TestEliminar {
        @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        Libro libro = new Libro("Libro01","Titulo","Autor");
        String codigo = "Libro01";
        ColeccionLibros instance = new ColeccionLibros();
        instance.agregar(libro);
        
        boolean expected = true;
        boolean actual = instance.eliminar(codigo);
        Assert.assertEquals(expected, actual);
    }
}
