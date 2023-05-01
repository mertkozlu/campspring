package kodla.io.rentAcar.wepApi.controllers;

import kodla.io.rentAcar.business.requests.CreateBrandRequest;
import kodla.io.rentAcar.business.responses.GetAllBrandsResponse;
import kodla.io.rentAcar.business.abstracts.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {
    private BrandService brandService;

    @Autowired
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/getall")
    public List<GetAllBrandsResponse> getAll() {
        return brandService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody CreateBrandRequest createBrandRequest) {
        this.brandService.add(createBrandRequest);
    }
}
