package it.epicode.BE_W5_D4.conf;

import it.epicode.BE_W5_D4.menu.Menu;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MenuConfigTest {
	@Autowired
	Menu menu;

	@Test
	@DisplayName("test correttezza valori inseriti")
	public void testOrdineMenuBean(){
		assertEquals("Menu Pranzo", menu.getNomeMenu());
		assertEquals(8,menu.getElementiMenu().size());
	}
}
