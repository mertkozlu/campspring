package kodla.io.rentAcar.business.concretes;

import kodla.io.rentAcar.business.abstracts.BrandService;
import kodla.io.rentAcar.core.utilities.mappers.ModelMapperService;
import kodla.io.rentAcar.dto.requests.CreateBrandRequest;
import kodla.io.rentAcar.dto.responses.GetAllBrandsResponse;
import kodla.io.rentAcar.dataAccess.abstracts.BrandRepository;
import kodla.io.rentAcar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
//        List<GetAllBrandsResponse> brandsResponse = new ArrayList<GetAllBrandsResponse>();

//        for(Brand brand : brands) {
//            GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
//            responseItem.setId(brand.getId());
//            responseItem.setName(brand.getName());
//
//            brandsResponse.add(responseItem);
//        }
        List<GetAllBrandsResponse> brandsResponse = brands.stream()
                .map(brand -> this.modelMapperService.forResponse()
                        .map(brand, GetAllBrandsResponse.class)).collect(Collectors.toList());

        return brandsResponse;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {

//        Brand brand = new Brand();
//        brand.setName(createBrandRequest.getName());

        Brand brand = this.modelMapperService.forRequest().map(createBrandRequest, Brand.class);

        this.brandRepository.save(brand);
    }
}
