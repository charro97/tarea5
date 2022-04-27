package usuario;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class usuarioTest {

	@Test
	public void testUsuarioCorrecto() {
		
		String resultado = Usuario.nombre_user("antonio", "jimenez", "1997");
		String esperado = "antoniojimenez1997";
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testUsuarioIncorrecto() {
		
		String resultado = Usuario.nombre_user("antonio", "jimenez", "1997");
		String esperado = "antonioojimenezz19997";
		assertEquals(esperado, resultado);
	}

}
