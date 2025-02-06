package it.epicode.BE_W5_D4.menu;

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
	List<ElementoMenu> elementiMenu = new ArrayList<>();
}
