package kodla.io.rentAcar.dataAccess.abstracts;

import kodla.io.rentAcar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand,Integer> {
    boolean existsByBrandName(String brandName); //spring jpa keywords
}
