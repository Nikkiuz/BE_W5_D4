package it.epicode.BE_W5_D4.topping;

import it.epicode.BE_W5_D4.menu.ElementoMenu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Topping implements ElementoMenu {
	private String nomeTopping;
	private int calorie;
	private double prezzo;

	@Override
	public String getNome() {
		return nomeTopping;
	}
}
