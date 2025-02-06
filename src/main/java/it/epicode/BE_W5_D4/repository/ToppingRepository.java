package it.epicode.BE_W5_D4.repository;

import it.epicode.BE_W5_D4.topping.Topping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToppingRepository extends JpaRepository<Topping,Long> {
	Topping findByNomeTopping(String nomeTopping);
	Topping findByCalorie(int calorie);
	Topping findByPrezzo(double prezzo);
	Topping findByNomeToppingAndCalorieAndPrezzo(String nomeTopping, int calorie, double prezzo);
	Topping findByCalorieAndPrezzo(int calorie, double prezzo);
	Topping findByCalorieAndPrezzoAndNomeTopping(int calorie, double prezzo, String nomeTopping);

	boolean existsByNomeTopping(String nomeTopping);
	boolean existsByCalorie(int calorie);
	boolean existsByPrezzo(double prezzo);
	boolean existsByCalorieAndPrezzo(int calorie, double prezzo);
	boolean existsByCalorieAndPrezzoAndNomeTopping(int calorie, double prezzo, String nomeTopping);

	int countByCalorie(int calorie);
	int countByPrezzo(double prezzo);
	int countByCalorieAndPrezzo(int calorie, double prezzo);

}
