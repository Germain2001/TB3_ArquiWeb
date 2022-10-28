package pe.edu.upc.project.andaseguro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.project.andaseguro.entities.Zone;

@Repository
public interface IZoneRepository extends JpaRepository<Zone, Integer> {
}
