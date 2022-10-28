package pe.edu.upc.project.andaseguro.entities;

public class Zone {
    private int idZone;
    private String NZone;
    private Boolean CFlag;
    private long CLength;

    public Zone() {
    }

    public Zone(int idZone, String NZone, Boolean CFlag, long CLength) {
        this.idZone = idZone;
        this.NZone = NZone;
        this.CFlag = CFlag;
        this.CLength = CLength;
    }

    public int getIdZone() {
        return idZone;
    }

    public void setIdZone(int idZone) {
        this.idZone = idZone;
    }

    public String getNZone() {
        return NZone;
    }

    public void setNZone(String NZone) {
        this.NZone = NZone;
    }

    public Boolean getCFlag() {
        return CFlag;
    }

    public void setCFlag(Boolean CFlag) {
        this.CFlag = CFlag;
    }

    public long getCLength() {
        return CLength;
    }

    public void setCLength(long CLength) {
        this.CLength = CLength;
    }
}
