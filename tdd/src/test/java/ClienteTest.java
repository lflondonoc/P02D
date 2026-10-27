import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    Cliente cliente= new Cliente("Juan","123",20,"juan@gamil.com");
    //1. Deben probar que el cliente tenga los datos correctos: nombre, cedula, edad, correo
    @Test
    void probarClienteDatosCorrectos(){
        assertEquals("Juan", cliente.getNombre());
        assertEquals("123", cliente.getCedula());
        assertEquals(20, cliente.getEdad());
        assertEquals("juan@gamil.com", cliente.getCorreo());
    }
    //2. Deben de guardar el correo correctamente
    @Test
    void guardarCorreoCorrectamente(){
        assertEquals("juan@gamil.com", cliente.getCorreo());
    }

    //3. El cliente debe ser mayor de edad
    @Test
    void clienteMayorDeEdad(){
        assertTrue(cliente.getEdad()>=18);
    }

    //4. El correo debe de contener un arroba
    @Test
    void correoDebeContenerArroba(){
        assertTrue(cliente.getCorreo().contains("@"));
    }

    //5. No debe permitir clientes menores de edad
    @Test
    void noDebePermitirCLientesMenoresEdad(){
        assertThrows(IllegalArgumentException.class, ()->{new Cliente("Juan","123",10,"juan@gamil.com");});
    }

    //6. No debe permitir correos sin arroba
    @Test
    void noDebePermitirCorreosSinArroba(){
        assertThrows(IllegalArgumentException.class, ()->{new Cliente("Juan","123",10,"juangamil.com");});
    }

}