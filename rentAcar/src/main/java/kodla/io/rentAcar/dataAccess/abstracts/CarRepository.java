package kodla.io.rentAcar.dataAccess.abstracts;

import kodla.io.rentAcar.entities.concretes.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {
}
