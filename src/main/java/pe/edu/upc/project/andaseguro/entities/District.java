package pe.edu.upc.project.andaseguro.entities;

import javax.persistence.*;

@Entity
@Table(name = "District")
public class District {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDistric;

    @Column(name = "NDistrict", length = 45, nullable = false)
    private String NDistrict;

    public District() {
    }

    public District(int idDistric, String NDistrict) {
        this.idDistric = idDistric;
        this.NDistrict = NDistrict;
    }

    public int getIdDistric() {
        return idDistric;
    }

    public String getNDistrict() {
        return NDistrict;
    }

    public void setIdDistric(int idDistric) {
        this.idDistric = idDistric;
    }

    public void setNDistrict(String NDistrict) {
        this.NDistrict = NDistrict;
    }
}
