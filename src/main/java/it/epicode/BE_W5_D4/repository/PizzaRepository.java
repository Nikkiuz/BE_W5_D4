package it.epicode.BE_W5_D4.repository;

import it.epicode.BE_W5_D4.pizze.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Integer> {
	Pizza findByNome(String nome);
	Pizza findByCalorie(int calorie);
	Pizza findByPrezzo(double prezzo);
	Pizza findByNomeAndCalorieAndPrezzo(String nome, int calorie, double prezzo);
	Pizza findByCalorieAndPrezzo(int calorie, double prezzo);
	Pizza findByCalorieAndPrezzoAndNome(int calorie, double prezzo, String nome);

	boolean existsByNome(String nome);
	boolean existsByCalorie(int calorie);
	boolean existsByPrezzo(double prezzo);
	boolean existsByCalorieAndPrezzo(int calorie, double prezzo);
	boolean existsByCalorieAndPrezzoAndNome(int calorie, double prezzo, String nome);

	int countByCalorie(int calorie);
	int countByPrezzo(double prezzo);
	int countByCalorieAndPrezzo(int calorie, double prezzo);
	int countByCalorieAndPrezzoAndNome(int calorie, double prezzo, String nome);

}
