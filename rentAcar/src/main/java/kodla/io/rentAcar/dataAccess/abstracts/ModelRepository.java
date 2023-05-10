package kodla.io.rentAcar.dataAccess.abstracts;

import kodla.io.rentAcar.entities.concretes.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model, Integer> {
}
