package it.epicode.BE_W5_D4.repository;

import it.epicode.BE_W5_D4.ordini.Ordine;
import it.epicode.BE_W5_D4.ordini.StatoOrdine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdineRepository extends JpaRepository<Ordine, Long> {
	Ordine findByNumeroOrdine(Long numeroOrdine);
	Ordine findByTavolo_NumeroTavolo(Long numeroTavolo);
	Ordine findByStatoOrdine(StatoOrdine statoOrdine);


	boolean existsByTavolo_NumeroTavolo(Long numeroTavolo);
	boolean existsByStatoOrdine(StatoOrdine statoOrdine);
	boolean existsByNumeroOrdine(Long numeroOrdine);

	int countByTavolo_NumeroTavolo(Long numeroTavolo);
	int countByStatoOrdine(StatoOrdine statoOrdine);
	int countByTavolo_NumeroTavoloAndStatoOrdine(Long numeroTavolo, StatoOrdine statoOrdine);

}
