package netflix.feign.models;


import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
public class Manufacturer extends Entity {


    private Long id;

    private String name;

    private Date foundedDate;

    private BigDecimal averageYearlySales;

    private Boolean active;

    private Long locationId;

}
