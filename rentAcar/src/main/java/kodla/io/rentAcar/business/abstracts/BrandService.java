package kodla.io.rentAcar.business.abstracts;

import kodla.io.rentAcar.dto.requests.CreateBrandRequest;
import kodla.io.rentAcar.dto.requests.UpdateBrandRequest;
import kodla.io.rentAcar.dto.responses.GetAllBrandsResponse;
import kodla.io.rentAcar.dto.responses.GetByIdBrandResponse;
import kodla.io.rentAcar.dto.responses.GetByIdModelResponse;

import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();

    void add(CreateBrandRequest createBrandRequest);

    GetByIdBrandResponse getById(int id);

    void update(UpdateBrandRequest updateBrandRequest);

    void delete(int id);
}
