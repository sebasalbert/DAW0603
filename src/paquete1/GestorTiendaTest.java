package paquete1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class GestorTiendaTest {

	 static GestorTienda gestorin;
	 
	 @BeforeAll
	 static void setUp() {
		 gestorin = new GestorTienda(); 
	    }

	    @Test
	    void testCalcularDescuento() {
	        assertEquals(10.0, gestorin.calcularDescuento(100, 10), 0.01); 
	        assertEquals(5.0, gestorin.calcularDescuento(100, 5), 0.01);
	        assertEquals(0.0, gestorin.calcularDescuento(100, 4), 0.01); 
	    }

	    @Test
	    void testCategorizarProducto() {
	        assertEquals("Económico", gestorin.categorizarProducto(9.99));
	        assertEquals("Estándar", gestorin.categorizarProducto(10)); 
	        assertEquals("Estándar", gestorin.categorizarProducto(49.99)); 
	        assertEquals("Premium", gestorin.categorizarProducto(50)); 
	        }

	    @Test
	    void testBuscarProducto() {
	    	String[] inventario = {"Zapatos", "Gorra", "Camiseta"};
	    	        
	        assertNull(gestorin.buscarProducto(inventario, "Calcetines")); 
	    	assertEquals("Camiseta", gestorin.buscarProducto(inventario, "Camiseta")); 
	    	assertNull(gestorin.buscarProducto(inventario, "Balon de futbol")); 
	    	}

	}

