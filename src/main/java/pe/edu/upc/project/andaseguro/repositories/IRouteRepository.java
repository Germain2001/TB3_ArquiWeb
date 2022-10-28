package pe.edu.upc.project.andaseguro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.project.andaseguro.entities.Route;
@Repository
public interface IRouteRepository extends JpaRepository<Route,Integer> {
}
