package netflix.feign.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Location extends Entity {


    private Long id;

    private String state;

    private String country;

}