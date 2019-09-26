package modelos;

import org.junit.Assert;
import org.junit.Test;

public class TestModificar {

    @Test
    public void testModificar() {
        System.out.println("Modificar");
        Libro libro = new Libro("Libro01", "Titulo", "Autor");
        ColeccionLibros instance = new ColeccionLibros();
        instance.agregar(libro);

        boolean expected = true;
        // Libro libro = new Libro("Libro01", "Titulo2", "Autor2");
        boolean actual = instance.modificar(libro);
        Assert.assertEquals(expected, actual);
    }
}
