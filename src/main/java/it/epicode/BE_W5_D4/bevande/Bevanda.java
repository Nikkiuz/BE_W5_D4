package it.epicode.BE_W5_D4.bevande;


import it.epicode.BE_W5_D4.menu.ElementoMenu;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "bevande")
public class Bevanda implements ElementoMenu {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long idBevanda;

	private String nomeBevanda;
	private double prezzo;
	private int calorie;

	@Override
	public String getNome() {
		return nomeBevanda;
	}
}
