package kodla.io.rentAcar.business.concretes;

import kodla.io.rentAcar.business.abstracts.BrandService;
import kodla.io.rentAcar.dataAccess.abstracts.BrandRepository;
import kodla.io.rentAcar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //Bu sınıf bir business nesnesidir
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;

    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        return brandRepository.getAll();
    }
}
