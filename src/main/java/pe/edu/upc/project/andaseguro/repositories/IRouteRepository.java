package pe.edu.upc.project.andaseguro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.project.andaseguro.entities.Route;

public interface IRouteRepository extends JpaRepository<Route, Integer> {
}
