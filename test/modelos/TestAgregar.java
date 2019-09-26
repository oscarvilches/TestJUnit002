package modelos;

import org.junit.Assert;
import org.junit.Test;

public class TestAgregar {

    @Test
    public void testAgregar() {
        System.out.println("Agregar");
        Libro libro = new Libro("Libro01","Titulo","Autor");
        ColeccionLibros instance = new ColeccionLibros();
        
        boolean expected = true;
        boolean actual = instance.agregar(libro);
        Assert.assertEquals(expected, actual);
    }
}
