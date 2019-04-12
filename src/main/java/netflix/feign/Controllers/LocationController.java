package netflix.feign.Controllers;


import netflix.feign.Service.LocationService;
import netflix.feign.models.Location;
import netflix.feign.models.Manufacturer;
import netflix.feign.models.Paging;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/locations")
public class LocationController {

    private LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }


    @RequestMapping(path = "/new", produces = "application/json", method = RequestMethod.POST)
    public Location insert(@RequestBody Location location) {
        return locationService.insert(location);
    }

    @RequestMapping(path = "/all", produces = "application/hal+json")
    public Paging locations(@RequestParam("page") Integer page, @RequestParam("size") Integer size) {
        return new Paging<>(new ArrayList<>(locationService.getLocations(page, size).getContent()),
                locationService.getPage(page, size).getContent().getPage());
    }


    @RequestMapping(path = "/{id}", produces = "application/json", method = RequestMethod.GET)
    public Location getLocationById(@PathVariable("id") Long id) {
        return locationService.getLocationById(id).getContent();
    }

    @RequestMapping(path = "/{id}/manufacturers", produces = "application/json", method = RequestMethod.GET)
    public ArrayList<Manufacturer> locationManufacture(@PathVariable("id") Long id) {
        return new ArrayList<>(locationService.getLocationManufacturers(id).getContent());
    }
}

