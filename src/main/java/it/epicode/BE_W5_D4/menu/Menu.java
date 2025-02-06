package it.epicode.BE_W5_D4.menu;

import it.epicode.BE_W5_D4.bevande.Bevanda;
import it.epicode.BE_W5_D4.pizze.Pizza;
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
@Table(name = "menu")
public class Menu {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long idMenu;
	private String nomeMenu;
	@OneToMany(cascade = CascadeType.PERSIST)
	List<Pizza> elementiMenuPizze = new ArrayList<>();
	@OneToMany(cascade = CascadeType.PERSIST)
	List<Bevanda> elementiMenuBevande = new ArrayList<>();
	@OneToMany(cascade = CascadeType.PERSIST)
	List<Topping> elementiMenuTopping = new ArrayList<>();
}
