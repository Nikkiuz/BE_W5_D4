package it.epicode.BE_W5_D4.bevande;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BevandaConfig{
	@Bean
	public Bevanda aranciata(){
		Bevanda b = new Bevanda();
		b.setNomeBevanda("Aranciata");
		b.setCalorie(100);
		b.setPrezzo(2.5);
		return b;
	}

	@Bean
	public Bevanda coca_cola(){
		Bevanda b = new Bevanda();
		b.setNomeBevanda("Coca Cola");
		b.setCalorie(150);
		b.setPrezzo(2.5);
		return b;
	}


}
