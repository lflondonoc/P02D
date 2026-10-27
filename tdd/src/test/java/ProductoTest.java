import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {

    Producto producto= new Producto("Banano", 500, 20);

    //Pruebas para el producto: banano

    //Prueba con el assertEquals
    @Test
    void productosTenganLosDatosCorrectos(){
        assertEquals("Banano", producto.getNombre());
        assertEquals(500, producto.getPrecio());
        assertEquals(20, producto.getCantidad());
    }
    //Pruebas con el assertTrue
    @Test
    void NoDebePermitirCantidadDisponibleNegativa(){
        assertTrue(producto.getCantidad()>0);
    }
    @Test
    void noDebePermitirPrecioNegativo(){
        assertTrue(producto.getPrecio()>0);
    }
    //Pruebas con el asserThrows
    @Test
    void noDebePermitirPrecioNegativo2(){
        assertThrows(IllegalArgumentException.class, ()-> {new Producto("Banano", -500, 20);
        });
    }
    @Test
    void noDebePermitirCantidadNegativa(){
        assertThrows(IllegalArgumentException.class, ()-> {new Producto("Banano", 500, -20);
        });

    }


}