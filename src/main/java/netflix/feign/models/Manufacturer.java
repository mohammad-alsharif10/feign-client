package netflix.feign.models;


import java.math.BigDecimal;
import java.util.Date;

public class Manufacturer extends Entity {


    private Long id;

    private String name;

    private Date foundedDate;

    private BigDecimal averageYearlySales;

    private Boolean active;

    private Long locationId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getFoundedDate() {
        return foundedDate;
    }

    public void setFoundedDate(Date foundedDate) {
        this.foundedDate = foundedDate;
    }

    public BigDecimal getAverageYearlySales() {
        return averageYearlySales;
    }

    public void setAverageYearlySales(BigDecimal averageYearlySales) {
        this.averageYearlySales = averageYearlySales;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }
}
