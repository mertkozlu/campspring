package kodla.io.rentAcar.dateAccess.abstracts;

import kodla.io.rentAcar.entities.concretes.Brand;

import java.util.List;

public interface BrandRepository {
    List<Brand> getAll();
}
