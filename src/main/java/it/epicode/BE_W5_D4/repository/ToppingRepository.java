package it.epicode.BE_W5_D4.repository;

import it.epicode.BE_W5_D4.topping.Topping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToppingRepository extends JpaRepository<Topping,Long> {
	Topping findByNomeTopping(String nomeTopping);
	Topping findByCalorie(int calorie);
	Topping findByPrezzo(double prezzo);

	boolean existsByNomeTopping(String nomeTopping);
	boolean existsByCalorie(int calorie);
	boolean existsByPrezzo(double prezzo);

	int countByCalorie(int calorie);
	int countByPrezzo(double prezzo);


}
