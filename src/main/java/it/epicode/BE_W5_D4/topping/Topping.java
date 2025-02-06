package it.epicode.BE_W5_D4.topping;

import it.epicode.BE_W5_D4.menu.ElementoMenu;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "topping")

public class Topping implements ElementoMenu {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long idTopping;

	private String nomeTopping;
	private int calorie;
	private double prezzo;

	@Override
	public String getNome() {
		return nomeTopping;
	}
}
