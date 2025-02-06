package it.epicode.BE_W5_D4.repository;

import it.epicode.BE_W5_D4.bevande.Bevanda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BevandaRepository extends JpaRepository<Bevanda,Long> {
	Bevanda findByNomeBevanda(String nomeBevanda);
	Bevanda findByCalorie(int calorie);
	Bevanda findByPrezzo(double prezzo);

	boolean existsByNomeBevanda(String nomeBevanda);
	boolean existsByCalorie(int calorie);
	boolean existsByPrezzo(double prezzo);

	int countByNomeBevanda(String nomeBevanda);
	int countByCalorie(int calorie);
	int countByPrezzo(double prezzo);

}
