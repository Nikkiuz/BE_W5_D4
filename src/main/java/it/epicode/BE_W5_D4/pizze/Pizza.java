package it.epicode.BE_W5_D4.pizze;


import it.epicode.BE_W5_D4.menu.ElementoMenu;
import it.epicode.BE_W5_D4.topping.Topping;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pizze")
public class Pizza implements ElementoMenu {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long idPizza;

	private String nomePizza;
	private int calorie;
	private double prezzo;
	@OneToMany
	List<Topping> toppings = new ArrayList<>();

	@Override
	public String getNome() {
		return nomePizza;
	}
}
