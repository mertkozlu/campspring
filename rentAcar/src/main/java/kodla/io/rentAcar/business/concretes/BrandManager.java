package kodla.io.rentAcar.business.concretes;

import kodla.io.rentAcar.business.abstracts.BrandService;
import kodla.io.rentAcar.core.utilities.mappers.ModelMapperService;
import kodla.io.rentAcar.dto.requests.CreateBrandRequest;
import kodla.io.rentAcar.dto.requests.UpdateBrandRequest;
import kodla.io.rentAcar.dto.responses.GetAllBrandsResponse;
import kodla.io.rentAcar.dataAccess.abstracts.BrandRepository;
import kodla.io.rentAcar.dto.responses.GetByIdBrandResponse;
import kodla.io.rentAcar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service //Bu sınıf bir business nesnesidir
@AllArgsConstructor
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllBrandsResponse> getAll() {

        List<Brand> brands = brandRepository.findAll();

        List<GetAllBrandsResponse> brandsResponse = brands.stream()
                .map(brand -> this.modelMapperService.forResponse()
                        .map(brand, GetAllBrandsResponse.class)).collect(Collectors.toList());

        /*        List<GetAllBrandsResponse> brandsResponse = new ArrayList<GetAllBrandsResponse>();
             for(Brand brand : brands) {
             GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
             responseItem.setId(brand.getId());
             responseItem.setName(brand.getName());

             brandsResponse.add(responseItem);
        } */
        return brandsResponse;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {
        Brand brand = this.modelMapperService.forRequest().map(createBrandRequest, Brand.class);

/*        Brand brand = new Brand();
          brand.setName(createBrandRequest.getName()); */

        this.brandRepository.save(brand);
    }

    @Override
    public GetByIdBrandResponse getById(int id) {
        Brand brand = this.brandRepository.findById(id).orElseThrow();
        GetByIdBrandResponse response = this.modelMapperService.forResponse()
                .map(brand, GetByIdBrandResponse.class);
        return response;
    }

    @Override
    public void update(UpdateBrandRequest updateBrandRequest) {
        Brand brand = this.modelMapperService.forRequest().map(updateBrandRequest, Brand.class);
        this.brandRepository.save(brand);
    }

    @Override
    public void delete(int id) {
        this.brandRepository.deleteById(id);
    }
}
