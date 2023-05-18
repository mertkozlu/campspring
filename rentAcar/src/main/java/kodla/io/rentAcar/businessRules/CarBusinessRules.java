package kodla.io.rentAcar.businessRules;

import kodla.io.rentAcar.core.utilities.exceptions.BusinessException;
import kodla.io.rentAcar.dataAccess.abstracts.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CarBusinessRules {
    private CarRepository carRepository;

    public void checkIfCarPlateExists(String plate) {
        if (this.carRepository.existsByPlate(plate)) {
            throw new BusinessException("A car already exists with this license plate code !");
        }
    }
}
