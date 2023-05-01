package kodla.io.rentAcar.dataAccess.abstracts;

import kodla.io.rentAcar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brand,Integer> {
}
