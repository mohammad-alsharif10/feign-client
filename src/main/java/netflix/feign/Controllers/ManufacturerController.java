package netflix.feign.Controllers;

import netflix.feign.Service.ManufacturerService;
import netflix.feign.models.Manufacturer;
import netflix.feign.models.Paging;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/manufacturers")
public class ManufacturerController {

    private ManufacturerService manufacturerService;

    public ManufacturerController(ManufacturerService manufacturerService) {
        this.manufacturerService = manufacturerService;
    }

    @RequestMapping(path = "/all", produces = "application/json")
    public Paging manufacturers(@RequestParam("page") Integer page, @RequestParam("size") Integer size) {
        return new Paging<>(new ArrayList<>(manufacturerService.getManufacturers().getContent()),
                manufacturerService.getPage(page, size).getContent().getPage());
    }

    @RequestMapping(path = "/{id}", produces = "application/json", method = RequestMethod.GET)
    public Manufacturer getManufacturerById(@PathVariable("id") Long id) {
        Manufacturer manufacturer = manufacturerService.getManufacturerById(id).getContent();
        manufacturer.setLocationId(manufacturerService.locationId(id));
        return manufacturer;
    }
}
