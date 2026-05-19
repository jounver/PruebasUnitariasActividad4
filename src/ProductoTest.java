import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import Modelo.Producto;

public class ProductoTest {

    Producto producto1;

    @Before
    public void setUp() {
        producto1 = new Producto("Samsung Galasxy", 300, "Version 6");
    }

    @Test
    public void testAñadirUnidadAlAlmacen() {

        producto1.añadirUnidadAlAlmacen();

        assertEquals(1, producto1.getNumeroDeUnidadesEnAlmacen());
    }

    @Test
    public void testQuitarUnidadDelAlmacen() {

        producto1.añadirUnidadAlAlmacen();
        producto1.quitarUnidadDeAlmacen();

        assertEquals(0, producto1.getNumeroDeUnidadesEnAlmacen());
    }

    @Test
    public void testEsMasCaro() {

        Producto producto2 = new Producto("Iphone", 1000, "Version 15");

        assertEquals(false, producto1.esMasCaro(producto2));
    }
}