package it.epicode.BE_W5_D4.repository;

import it.epicode.BE_W5_D4.ordini.Ordine;
import it.epicode.BE_W5_D4.ordini.StatoOrdine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdineRepository extends JpaRepository<Ordine, Long> {
	Ordine findByNumeroOrdine(Long numeroOrdine);
	Ordine findByTavolo_NumeroTavolo(Long numeroTavolo);
	Ordine findByTavolo_NumeroTavoloAndStatoOrdine(Long numeroTavolo, StatoOrdine statoOrdine);
	Ordine findByStatoOrdine(StatoOrdine statoOrdine);
	Ordine findByStatoOrdineAndTavolo_NumeroTavolo(StatoOrdine statoOrdine, Long numeroTavolo);
	Ordine findByStatoOrdineAndTavolo_NumeroTavoloAndNumeroOrdine(StatoOrdine statoOrdine, Long numeroTavolo, Long numeroOrdine);

	boolean existsByStatoOrdineAndTavolo_NumeroTavoloAndNumeroOrdine(StatoOrdine statoOrdine, Long numeroTavolo, Long numeroOrdine);
	boolean existByStatoOrdineAndTavolo_NumeroTavolo(StatoOrdine statoOrdine, Long numeroTavolo);
	boolean existsByTavolo_NumeroTavolo(Long numeroTavolo);
	boolean existsByTavolo_NumeroTavoloAndStatoOrdine(Long numeroTavolo, StatoOrdine statoOrdine);
	boolean existsByStatoOrdine(StatoOrdine statoOrdine);
	boolean existsByNumeroOrdine(Long numeroOrdine);

	int countByTavolo_NumeroTavolo(Long numeroTavolo);
	int countByStatoOrdine(StatoOrdine statoOrdine);
	int countByTavolo_NumeroTavoloAndStatoOrdine(Long numeroTavolo, StatoOrdine statoOrdine);
	int countByStatoOrdineAndTavolo_NumeroTavolo(StatoOrdine statoOrdine, Long numeroTavolo);
	int countByStatoOrdineAndTavolo_NumeroTavoloAndNumeroOrdine(StatoOrdine statoOrdine, Long numeroTavolo, Long numeroOrdine);
	int countByTavolo_NumeroTavoloAndStatoOrdineAndNumeroOrdine(Long numeroTavolo, StatoOrdine statoOrdine, Long numeroOrdine);

}
