package kodla.io.rentAcar.business.abstracts;

import kodla.io.rentAcar.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
    List<Brand> getAll();
}
