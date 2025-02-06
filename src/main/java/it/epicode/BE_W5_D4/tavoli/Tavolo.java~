package it.epicode.BE_W5_D4.tavoli;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tavoli")
public class Tavolo {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int idTavolo;

	private int numeroTavolo;
	private int numeroMaxCoperti;
	@OneToOne
	private StatoTavolo statoTavolo;
}
