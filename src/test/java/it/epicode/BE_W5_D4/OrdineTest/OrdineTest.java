package it.epicode.BE_W5D1.OrdineTest;

import it.epicode.BE_W5D1.bevande.Bevanda;
import it.epicode.BE_W5D1.menu.ElementoMenu;
import it.epicode.BE_W5D1.ordini.Ordine;
import it.epicode.BE_W5D1.ordini.StatoOrdine;
import it.epicode.BE_W5D1.pizze.Pizza;
import it.epicode.BE_W5D1.tavoli.Tavolo;
import it.epicode.BE_W5D1.topping.Topping;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class OrdineTest {
	@Autowired
	private Pizza funghiSalsiccia;
	@Autowired
	private Bevanda aranciata;
	@Autowired
	private Topping salame;
	@Value("${costo.coperto}")
	double costoCoperto;

	@Test
	@DisplayName("test di creazione ordine")
	public void testOrdine() {
		int numeroOrdine = 1;
		Tavolo tavolo = new Tavolo();
		StatoOrdine statoOrdine = StatoOrdine.IN_CORSO;
		int numeroCoperti = 2;
		LocalDateTime oraAcquisizione = LocalDateTime.now();
		List<ElementoMenu> elementiOrdine = List.of(funghiSalsiccia,aranciata,salame);

		Ordine ordine = new Ordine();
		ordine.setNumeroOrdine(numeroOrdine);
		ordine.setTavolo(tavolo);
		ordine.setStatoOrdine(statoOrdine);
		ordine.setNumeroCoperti(numeroCoperti);
		ordine.setOraAcquisizione(oraAcquisizione);
		ordine.setElementiOrdine(elementiOrdine);
		ordine.setCostoCoperto(costoCoperto);

		ordine.stampaOrdine();

		assertNotNull(ordine);
		assertEquals(3, ordine.getElementiOrdine().size());
	}

}
