package pe.edu.upc.project.andaseguro.servicesinterfaces;

import pe.edu.upc.project.andaseguro.entities.Direction;

import java.util.List;
import java.util.Optional;

public interface IDirectionService {

    public void insert(Direction direction);
    public List<Direction> list();
    public void delete(int idDirection);
    List<Direction> searchName(String nameDirection);
}
