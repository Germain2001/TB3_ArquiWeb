package pe.edu.upc.project.andaseguro.entities;

import javax.persistence.*;

@Entity
@Table(name="Complaint")
public class Complaint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComplaint;

    @Column(name = "NComplaint", length = 45, nullable = false)
    private String NComplaint;

    //private PoliceStation policeStation;
    //private Zone zone;


    public Complaint() {
    }

    public Complaint(int idComplaint, String NComplaint) {
        this.idComplaint = idComplaint;
        this.NComplaint = NComplaint;
    }

    public int getIdComplaint() {
        return idComplaint;
    }

    public void setIdComplaint(int idComplaint) {
        this.idComplaint = idComplaint;
    }

    public String getNComplaint() {
        return NComplaint;
    }

    public void setNComplaint(String NComplaint) {
        this.NComplaint = NComplaint;
    }
}
