package kodla.io.rentAcar.wepApi.controllers;

import kodla.io.rentAcar.dto.requests.CreateBrandRequest;
import kodla.io.rentAcar.dto.responses.GetAllBrandsResponse;
import kodla.io.rentAcar.business.abstracts.BrandService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandsController {
    private BrandService brandService;

    @GetMapping("/getall")
    public List<GetAllBrandsResponse> getAll() {
        return brandService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody CreateBrandRequest createBrandRequest) {
        this.brandService.add(createBrandRequest);
    }
}
