package netflix.feign.Service;

import netflix.feign.models.Manufacturer;
import netflix.feign.models.PageAndSize;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "manufacturer-service", url = "data-rest-cloud.cfapps.io/manufacturers")
public interface ManufacturerService {


    @RequestMapping(method = RequestMethod.GET, path = "/")
    Resources<Manufacturer> getManufacturers();

    @RequestMapping(method = RequestMethod.GET, path = "/")
    Resource<PageAndSize> getPage(@RequestParam("page") Integer page, @RequestParam("size") Integer size);

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    Resource<Manufacturer> getManufacturerById(@PathVariable("id") Long id);

    @RequestMapping(method = RequestMethod.GET, path = "/search/locationId")
    Long locationId(@RequestParam("id") Long id);

}
