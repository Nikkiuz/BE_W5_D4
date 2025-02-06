package it.epicode.BE_W5_D4.pizze;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PizzaConfig {

	@Bean
	public Pizza margherita() {
		Pizza p = new Pizza();
		p.setNomePizza("Margherita");
		p.setCalorie(500);
		p.setPrezzo(6);
		return p;
	}

	@Bean
	public Pizza marinara() {
		Pizza p = new Pizza();
		p.setNomePizza("Marinara");
		p.setCalorie(600);
		p.setPrezzo(5);
		return p;
	}

	@Bean
	public Pizza funghiSalsiccia() {
		Pizza p = new Pizza();
		p.setNomePizza("Funghi e salsiccia");
		p.setCalorie(700);
		p.setPrezzo(9);
		return p;
	}

	@Bean
	public Pizza capricciosa() {
		Pizza p = new Pizza();
		p.setNomePizza("Capricciosa");
		p.setCalorie(800);
		p.setPrezzo(10);
		return p;
	}
}
