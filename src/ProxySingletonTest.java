import static org.junit.Assert.*;

import org.junit.Test;

public class ProxySingletonTest {

	@Test
	public void testAdicionar() {
		//1
		ProxySingleton jenncyportesebien = ProxySingleton.reemplazarConstructora();
		//2
		Usuario tatoestapelon = new Usuario("santiagocepeda@unisabana.edu.co","12345678");
		//3
		jenncyportesebien.adicionar("101010101010101", tatoestapelon);
		//4
		assertEquals(jenncyportesebien.buscar("101010101010101").getPassword(), "12345678");
		
		Usuario usuario2 = jenncyportesebien.buscar("101010101010101");
		
		assertEquals(tatoestapelon.getEmail(), usuario2.getEmail());
		
		jenncyportesebien.eliminar("101010101010101");
		
		assertNull(jenncyportesebien.buscar("101010101010101"));
	}
	
	@Test
	public void testBuscar(){
		
		ProxySingleton jenncyportesebien = ProxySingleton.reemplazarConstructora();
		
		Usuario tatoestapelon = new Usuario("santiagocepeda@unisabana.edu.co","12345678");

		jenncyportesebien.adicionar("101010101010101", tatoestapelon);
		
		Usuario usuario2 = jenncyportesebien.buscar("101010101010101");
		
		assertEquals(tatoestapelon.getEmail(), usuario2.getEmail());
	
	}
	
	@Test
	public void testEliminar(){
		
		ProxySingleton jenncyportesebien = ProxySingleton.reemplazarConstructora();

		Usuario tatoestapelon = new Usuario("santiagocepeda@unisabana.edu.co","12345678");

		jenncyportesebien.adicionar("101010101010101", tatoestapelon);	
		
		jenncyportesebien.eliminar("101010101010101");
		
		assertTrue(jenncyportesebien.buscar("101010101010101")==null);
	
	}
	
	@Test
	public void testActualizar() {

		ProxySingleton jenncyportesebien = ProxySingleton.reemplazarConstructora();

		Usuario tatoestapelon = new Usuario("santiagocepeda@unisabana.edu.co","12345678");

		jenncyportesebien.adicionar("101010101010101", tatoestapelon);
		
		Usuario usuario2 = new Usuario("usuario@correo.com","123");
		
		jenncyportesebien.actualizar("101010101010101", usuario2);
				
		assertEquals(jenncyportesebien.buscar("101010101010101").getEmail(),"usuario@correo.com");
	}
	
	

}
