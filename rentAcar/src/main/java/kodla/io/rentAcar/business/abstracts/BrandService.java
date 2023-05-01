package kodla.io.rentAcar.business.abstracts;

import kodla.io.rentAcar.business.requests.CreateBrandRequest;
import kodla.io.rentAcar.business.responses.GetAllBrandsResponse;
import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();
    void add(CreateBrandRequest createBrandRequest);
}
