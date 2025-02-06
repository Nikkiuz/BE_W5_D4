package it.epicode.BE_W5_D4.tavoli;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tavolo {
	private int numeroTavolo;
	private int numeroMaxCoperti;
	private StatoTavolo statoTavolo;
}
