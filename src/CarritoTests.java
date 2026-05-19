import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import Modelo.CarroDeLaCompra;
import Modelo.Producto;

public class CarritoTests {

    Producto producto1;
    Producto producto2;
    CarroDeLaCompra carro;

    @Before
    public void setUp() {

        producto1 = new Producto("Samsung Galaxy", 500, "Version 6");
        producto2 = new Producto("Iphone", 1000, "Version 15");

        carro = new CarroDeLaCompra();
    }

    @Test
    public void testAñadirProductoAlCarro() {

        carro.añadirProductoAlCarrro(producto1);

        assertEquals(500, carro.getTotal());
    }

    @Test
    public void testComprarCarrito() {

        carro.comprarCarrito();

        assertEquals(CarroDeLaCompra.ESTADO.COMPRADO, carro.getEstado());
    }
}
