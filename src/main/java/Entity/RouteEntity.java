package Entity;

import javax.persistence.*;

@Entity
@Table(name = "route", schema = "dk-317_air")
public class RouteEntity {
    private int id;
    private String airline;
    private String sourceAirport;
    private String destinationAirport;
    private byte codeshare;
    private byte stops;
    private String equipment;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "airline", nullable = false, length = 16)
    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    @Basic
    @Column(name = "source_airport", nullable = false, length = 16)
    public String getSourceAirport() {
        return sourceAirport;
    }

    public void setSourceAirport(String sourceAirport) {
        this.sourceAirport = sourceAirport;
    }

    @Basic
    @Column(name = "destination_airport", nullable = false, length = 16)
    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    @Basic
    @Column(name = "codeshare", nullable = false)
    public byte getCodeshare() {
        return codeshare;
    }

    public void setCodeshare(byte codeshare) {
        this.codeshare = codeshare;
    }

    @Basic
    @Column(name = "stops", nullable = false)
    public byte getStops() {
        return stops;
    }

    public void setStops(byte stops) {
        this.stops = stops;
    }

    @Basic
    @Column(name = "equipment", nullable = false, length = 64)
    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RouteEntity that = (RouteEntity) o;

        if (id != that.id) return false;
        if (codeshare != that.codeshare) return false;
        if (stops != that.stops) return false;
        if (airline != null ? !airline.equals(that.airline) : that.airline != null) return false;
        if (sourceAirport != null ? !sourceAirport.equals(that.sourceAirport) : that.sourceAirport != null)
            return false;
        if (destinationAirport != null ? !destinationAirport.equals(that.destinationAirport) : that.destinationAirport != null)
            return false;
        if (equipment != null ? !equipment.equals(that.equipment) : that.equipment != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (airline != null ? airline.hashCode() : 0);
        result = 31 * result + (sourceAirport != null ? sourceAirport.hashCode() : 0);
        result = 31 * result + (destinationAirport != null ? destinationAirport.hashCode() : 0);
        result = 31 * result + (int) codeshare;
        result = 31 * result + (int) stops;
        result = 31 * result + (equipment != null ? equipment.hashCode() : 0);
        return result;
    }
}
