package pe.edu.upc.project.andaseguro.servicesinterfaces;

import pe.edu.upc.project.andaseguro.entities.PoliceStation;

import java.util.List;

public interface IPoliceStationService {
    public void insert(PoliceStation policeStation);
    public List<PoliceStation> list();
    public void delete(int idPoliceStation);
    List<PoliceStation> searchName(String namePoliceStation);
}
