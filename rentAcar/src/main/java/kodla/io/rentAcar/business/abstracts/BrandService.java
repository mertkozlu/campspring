package kodla.io.rentAcar.business.abstracts;

import kodla.io.rentAcar.dto.requests.CreateBrandRequest;
import kodla.io.rentAcar.dto.responses.GetAllBrandsResponse;
import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();
    void add(CreateBrandRequest createBrandRequest);
}
