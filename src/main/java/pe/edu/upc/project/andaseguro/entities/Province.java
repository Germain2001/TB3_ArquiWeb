package pe.edu.upc.project.andaseguro.entities;

import javax.persistence.*;

@Entity
@Table(name = "Province")
public class Province {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProvince;

    @Column(name = "NProvince", length = 45, nullable = false)
    private String NProvince;

    public Province() {
    }

    public Province(int idProvince, String NProvince) {
        this.idProvince = idProvince;
        this.NProvince = NProvince;
    }

    public int getIdProvince() {
        return idProvince;
    }

    public String getNProvince() {
        return NProvince;
    }

    public void setIdProvince(int idProvince) {
        this.idProvince = idProvince;
    }

    public void setNProvince(String NProvince) {
        this.NProvince = NProvince;
    }
}
