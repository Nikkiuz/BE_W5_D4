package it.epicode.BE_W5_D4.repository;

import it.epicode.BE_W5_D4.menu.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Long> {
	Menu findByNomeMenu(String nomeMenu);

	boolean existsByNomeMenu(String nomeMenu);

	int countByNomeMenu(String nomeMenu);
}
