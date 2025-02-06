package it.epicode.BE_W5_D4.runners;

import it.epicode.BE_W5_D4.menu.Menu;
import it.epicode.BE_W5_D4.ordini.Ordine;
import it.epicode.BE_W5_D4.ordini.StatoOrdine;
import it.epicode.BE_W5_D4.repository.OrdineRepository;
import it.epicode.BE_W5_D4.tavoli.Tavolo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ApplicationRunner implements CommandLineRunner {
	@Autowired
	private OrdineRepository ordineRepository;
	@Autowired
	private Menu menuPranzo;
	@Value("${costo.coperto}")
	private double costoCoperto;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(menuPranzo);

		Tavolo tavolo = new Tavolo();
		tavolo.setNumeroTavolo(1);

		Ordine ordine = new Ordine();
		ordine.setNumeroOrdine(1);
		ordine.setTavolo(tavolo);
		ordine.setStatoOrdine(StatoOrdine.IN_CORSO);
		ordine.setNumeroCoperti(2);
		ordine.setCostoCoperto(costoCoperto);
		ordine.setElementiOrdine(List.of(
			menuPranzo.getElementiMenu().get(0),
			menuPranzo.getElementiMenu().get(1),
			menuPranzo.getElementiMenu().get(2)));

		ordine.stampaOrdine();
		ordineRepository.save(ordine);
	}
}
