package modelos;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class TestListar {

    @Test
    public void testListar() {
        System.out.println("Listar");
        ColeccionLibros instance = new ColeccionLibros();
        
        ArrayList<Libro> expected = new ArrayList<>();
        ArrayList<Libro> actual = instance.listar();
        Assert.assertEquals(expected, actual);
    }
}
