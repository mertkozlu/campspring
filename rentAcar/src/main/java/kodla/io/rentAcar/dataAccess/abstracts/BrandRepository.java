package kodla.io.rentAcar.dataAccess.abstracts;

import kodla.io.rentAcar.entities.concretes.Brand;

import java.util.List;

public interface BrandRepository {
    List<Brand> getAll();
}
