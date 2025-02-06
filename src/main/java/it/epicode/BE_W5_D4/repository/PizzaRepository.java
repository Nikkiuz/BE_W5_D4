package it.epicode.BE_W5_D4.repository;

import it.epicode.BE_W5_D4.pizze.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Integer> {
	Pizza findByNomePizza(String nome);
	Pizza findByCalorie(int calorie);
	Pizza findByPrezzo(double prezzo);

	boolean existsByNomePizza(String nome);
	boolean existsByCalorie(int calorie);
	boolean existsByPrezzo(double prezzo);

	int countByCalorie(int calorie);
	int countByPrezzo(double prezzo);
	int countByNomePizza(String nome);
}
