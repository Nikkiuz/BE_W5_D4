package it.epicode.BE_W5_D4.menu;

import it.epicode.BE_W5_D4.bevande.Bevanda;
import it.epicode.BE_W5_D4.pizze.Pizza;
import it.epicode.BE_W5_D4.topping.Topping;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@RequiredArgsConstructor
public class MenuConfig {
	private final Bevanda aranciata;
	private final Bevanda coca_cola;
	private final Pizza margherita;
	private final Pizza marinara;
	private final Pizza funghiSalsiccia;
	private final Pizza capricciosa;
	private final Topping abbondanteMozzarella;
	private final Topping salame;

	@Bean
	public Menu creaMenu() {
		Menu m = new Menu();
		m.setNomeMenu("Menu Pranzo");
		m.setElementiMenu(List.of(aranciata, coca_cola, margherita, marinara, funghiSalsiccia, capricciosa,
			abbondanteMozzarella, salame));
		return m;
	}
}
