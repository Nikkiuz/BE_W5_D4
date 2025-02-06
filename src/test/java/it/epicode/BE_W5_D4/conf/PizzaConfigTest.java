package it.epicode.BE_W5_D4.conf;

import it.epicode.BE_W5_D4.pizze.Pizza;
import it.epicode.BE_W5_D4.pizze.PizzaConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PizzaConfigTest {
	@Autowired
	@Qualifier("funghiSalsiccia")
	private Pizza pizza;
//	@Autowired private Pizza funghiSalsiccia;
//	@Autowired private Pizza capricciosa;


	@Test
	@DisplayName("Test verifica valori inseriti")
	public void testFunghiSalsiccia(){
		assertEquals("Funghi e salsiccia",pizza.getNome());
		assertEquals(700, pizza.getCalorie());
		assertEquals(9,pizza.getPrezzo());
	}

	@ParameterizedTest
	@CsvSource({
		"Margherita,400,6",
		"Marinara,606,5",
		"Capricciosa,801,10"
	})


	@DisplayName("Test pizze create per verificare correttezza valori inseriti")
	public void testPizzaPrint(String nomePizza,int calorie,double prezzo) {
		Pizza p = new Pizza();
		p.setNomePizza(nomePizza);
		p.setCalorie(calorie);
		p.setPrezzo(prezzo);
	}
}
