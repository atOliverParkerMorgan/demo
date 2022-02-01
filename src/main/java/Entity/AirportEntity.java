package Entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "airport", schema = "dk-317_air")
public class AirportEntity {
    private int id;
    private String name;
    private String city;
    private String country;
    private String iataFaa;
    private String icao;
    private double latitude;
    private double longitude;
    private double altitude;
    private BigDecimal timezone;
    private Object dst;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 64)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "city", nullable = false, length = 64)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "country", nullable = false, length = 64)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "iata_faa", nullable = false, length = 16)
    public String getIataFaa() {
        return iataFaa;
    }

    public void setIataFaa(String iataFaa) {
        this.iataFaa = iataFaa;
    }

    @Basic
    @Column(name = "icao", nullable = false, length = 16)
    public String getIcao() {
        return icao;
    }

    public void setIcao(String icao) {
        this.icao = icao;
    }

    @Basic
    @Column(name = "latitude", nullable = false, precision = 0)
    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    @Basic
    @Column(name = "longitude", nullable = false, precision = 0)
    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Basic
    @Column(name = "altitude", nullable = false, precision = 0)
    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    @Basic
    @Column(name = "timezone", nullable = false, precision = 2)
    public BigDecimal getTimezone() {
        return timezone;
    }

    public void setTimezone(BigDecimal timezone) {
        this.timezone = timezone;
    }

    @Basic
    @Column(name = "dst", nullable = false)
    public Object getDst() {
        return dst;
    }

    public void setDst(Object dst) {
        this.dst = dst;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AirportEntity that = (AirportEntity) o;

        if (id != that.id) return false;
        if (Double.compare(that.latitude, latitude) != 0) return false;
        if (Double.compare(that.longitude, longitude) != 0) return false;
        if (Double.compare(that.altitude, altitude) != 0) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (iataFaa != null ? !iataFaa.equals(that.iataFaa) : that.iataFaa != null) return false;
        if (icao != null ? !icao.equals(that.icao) : that.icao != null) return false;
        if (timezone != null ? !timezone.equals(that.timezone) : that.timezone != null) return false;
        if (dst != null ? !dst.equals(that.dst) : that.dst != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (iataFaa != null ? iataFaa.hashCode() : 0);
        result = 31 * result + (icao != null ? icao.hashCode() : 0);
        temp = Double.doubleToLongBits(latitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(longitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(altitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (timezone != null ? timezone.hashCode() : 0);
        result = 31 * result + (dst != null ? dst.hashCode() : 0);
        return result;
    }
}
