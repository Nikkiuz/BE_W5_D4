package it.epicode.BE_W5_D4.runners;

import it.epicode.BE_W5_D4.menu.Menu;
import it.epicode.BE_W5_D4.ordini.Ordine;
import it.epicode.BE_W5_D4.ordini.StatoOrdine;
import it.epicode.BE_W5_D4.repository.MenuRepository;
import it.epicode.BE_W5_D4.repository.OrdineRepository;
import it.epicode.BE_W5_D4.repository.TavoliRepository;
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
	private TavoliRepository tavoliRepository;
	@Autowired
	private MenuRepository menuRepository;
	@Autowired
	private Menu menuPranzo;
	@Value("${costo.coperto}")
	private double costoCoperto;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(menuPranzo);

		// Creazione e salvataggio del Tavolo
		Tavolo tavolo = new Tavolo();
		tavolo.setNumeroTavolo(1);
		tavoliRepository.save(tavolo); // Salva il tavolo prima di assegnarlo all'ordine

		// Creazione dell'ordine
		Ordine ordine = new Ordine();
		ordine.setNumeroOrdine(1);
		ordine.setTavolo(tavolo);
		ordine.setStatoOrdine(StatoOrdine.IN_CORSO);
		ordine.setNumeroCoperti(2);
		ordine.setCostoCoperto(costoCoperto);


		// Aggiunta degli elementi al corretto tipo di lista, con controllo per evitare errori
		if (!menuPranzo.getElementiMenuPizze().isEmpty()) {
			ordine.getElementiOrdinePizze().add(menuPranzo.getElementiMenuPizze().get(0));
		}
		if (!menuPranzo.getElementiMenuBevande().isEmpty()) {
			ordine.getElementiOrdineBevande().add(menuPranzo.getElementiMenuBevande().get(0));
		}
		if (!menuPranzo.getElementiMenuTopping().isEmpty()) {
			ordine.getElementiOrdineTopping().add(menuPranzo.getElementiMenuTopping().get(0));
		}

		// Stampa e salvataggio
		ordine.stampaOrdine();
		//menuRepository.save(menuPranzo);
		ordineRepository.save(ordine);
	}
}