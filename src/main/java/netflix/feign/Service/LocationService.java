package netflix.feign.Service;



import netflix.feign.models.Location;
import netflix.feign.models.Manufacturer;
import netflix.feign.models.PageAndSize;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.*;


@FeignClient(name = "location-service", url = "data-rest-cloud.cfapps.io/locations")
public interface LocationService {


    @RequestMapping(method = RequestMethod.GET, path = "/")
    Resource<PageAndSize> getPage(@RequestParam("page") Integer page, @RequestParam("size") Integer size);

    @RequestMapping(method = RequestMethod.GET, path = "/")
    Resources<Location> getLocations(@RequestParam("page") Integer page, @RequestParam("size") Integer size);

    @RequestMapping(method = RequestMethod.POST, path = "/")
    Location insert(@RequestBody Location location);

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    Resource<Location> getLocationById(@PathVariable("id") Long id);

    @RequestMapping(method = RequestMethod.GET, path = "/{id}/manufacturers")
    Resources<Manufacturer> getLocationManufacturers(@PathVariable("id") Long LocationId);


}
