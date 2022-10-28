package pe.edu.upc.project.andaseguro.servicesinterfaces;

import pe.edu.upc.project.andaseguro.entities.Complaint;

import java.util.List;
import java.util.Optional;

public interface IComplaintService {
    public void insert(Complaint complaint);
    public List<Complaint> list();
    public void delete(int idComplaint);
    List<Complaint> searchName(String nameComplaint);
}
