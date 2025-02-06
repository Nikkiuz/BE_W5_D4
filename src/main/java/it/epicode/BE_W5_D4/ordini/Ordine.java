package it.epicode.BE_W5_D4.ordini;

import it.epicode.BE_W5_D4.bevande.Bevanda;
import it.epicode.BE_W5_D4.menu.ElementoMenu;
import it.epicode.BE_W5_D4.pizze.Pizza;
import it.epicode.BE_W5_D4.tavoli.Tavolo;
import it.epicode.BE_W5_D4.topping.Topping;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ordini")
public class Ordine {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long idOrdine;

	private int numeroOrdine;
	@ManyToOne
	private Tavolo tavolo;
	@Enumerated(EnumType.STRING)
	private StatoOrdine statoOrdine;
	private int numeroCoperti;
	private LocalDateTime oraAcquisizione = LocalDateTime.now();
	@OneToMany(cascade = CascadeType.PERSIST)
	private List<Pizza> elementiOrdinePizze = new ArrayList<>();
	@OneToMany(cascade = CascadeType.PERSIST)
	private List<Bevanda> elementiOrdineBevande = new ArrayList<>();
	@OneToMany(cascade = CascadeType.PERSIST)
	private List<Topping> elementiOrdineTopping = new ArrayList<>();
	private double costoCoperto = 0.0;
	public double calcolaCostoCoperto(){
		double totaleCoperto = numeroCoperti * costoCoperto;
		double sommaPrezzi = 0.0;

		for (Pizza pizza : elementiOrdinePizze) {
			sommaPrezzi += pizza.getPrezzo();
		}
		for (Bevanda bevanda : elementiOrdineBevande) {
			sommaPrezzi += bevanda.getPrezzo();
		}
		for (Topping topping : elementiOrdineTopping) {
			sommaPrezzi += topping.getPrezzo();
		}

		return totaleCoperto + sommaPrezzi;
	}

	public void stampaOrdine(){
		System.out.println("Numero ordine: " + numeroOrdine);
		System.out.println("Tavolo: " + tavolo);
		System.out.println("Stato ordine: " + statoOrdine);
		System.out.println("Numero coperti: " + numeroCoperti);
		System.out.println("Ora acquisizione: " + oraAcquisizione);
		System.out.println("Elementi dell'ordine: ");

		for (Pizza pizza : elementiOrdinePizze) {
			System.out.println(pizza);
		}
		for (Bevanda bevanda : elementiOrdineBevande) {
			System.out.println(bevanda);
		}
		for (Topping topping : elementiOrdineTopping) {
			System.out.println(topping);
		}

		System.out.println("Costo coperto: " + costoCoperto);
		System.out.println("Costo totale: " + calcolaCostoCoperto());
	}
}







