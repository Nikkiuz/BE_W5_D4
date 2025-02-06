package it.epicode.BE_W5_D4.repository;

import it.epicode.BE_W5_D4.tavoli.StatoTavolo;
import it.epicode.BE_W5_D4.tavoli.Tavolo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TavoliRepository extends JpaRepository<Tavolo, Long> {
	Tavolo findByNumeroTavolo(int numeroTavolo);
	Tavolo findByStatoTavolo(StatoTavolo statoTavolo);
	Tavolo findByNumeroTavoloAndStatoTavolo(int numeroTavolo, StatoTavolo statoTavolo);

	boolean existsByNumeroTavolo(int numeroTavolo);
	boolean existsByStatoTavolo(StatoTavolo statoTavolo);
	boolean existsByNumeroTavoloAndStatoTavolo(int numeroTavolo, StatoTavolo statoTavolo);

	int countByStatoTavolo(StatoTavolo statoTavolo);
	int countByNumeroTavoloAndStatoTavolo(int numeroTavolo, StatoTavolo statoTavolo);

}
