package paquete1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class GestorTiendaTest {

	 static GestorTienda gestor;
	 
	 @BeforeAll
	 static void setUp() {
		 gestor = new GestorTienda(); 
	    }

	    @Test
	    void testCalcularDescuento() {
	        assertEquals(10.0, gestor.calcularDescuento(100, 10), 0.01); 
	        assertEquals(5.0, gestor.calcularDescuento(100, 5), 0.01);
	        assertEquals(0.0, gestor.calcularDescuento(100, 4), 0.01); 
	    }

	    @Test
	    void testCategorizarProducto() {
	        assertEquals("Económico", gestor.categorizarProducto(9.99));
	        assertEquals("Estándar", gestor.categorizarProducto(10)); 
	        assertEquals("Estándar", gestor.categorizarProducto(49.99)); 
	        assertEquals("Premium", gestor.categorizarProducto(50)); 
	        }

	    @Test
	    void testBuscarProducto() {
	        String[] inventario = {"Zapatos", "Gorra", "Camiseta"};
	        assertEquals("Marca", gestor.buscarProducto(inventario, "Calcetines")); 
	        assertNull(gestor.buscarProducto(inventario, "Camiseta")); 
	        assertEquals("Teclado", gestor.buscarProducto(inventario, "Balon de futbol")); 
	        }
	}

