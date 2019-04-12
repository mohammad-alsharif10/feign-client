package netflix.feign.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
public class Paging<entity extends Entity> {

    private ArrayList<entity> entities;

    private page page;
}
