package kodla.io.rentAcar.business.concretes;

import kodla.io.rentAcar.business.abstracts.CarService;
import kodla.io.rentAcar.core.utilities.mappers.ModelMapperService;
import kodla.io.rentAcar.dataAccess.abstracts.CarRepository;
import kodla.io.rentAcar.dto.requests.CreateCarRequest;
import kodla.io.rentAcar.dto.responses.GetAllCarsResponse;
import kodla.io.rentAcar.entities.concretes.Car;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CarManager implements CarService {
    private CarRepository carRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllCarsResponse> getAll() {

        List<Car> cars = carRepository.findAll();

        List<GetAllCarsResponse> carsResponse = cars.stream()
                .map(car -> this.modelMapperService.forResponse()
                        .map(car, GetAllCarsResponse.class)).collect(Collectors.toList());

        return carsResponse;
    }

    @Override
    public void add(CreateCarRequest createCarRequest) {

        Car car = this.modelMapperService.forRequest().map(createCarRequest, Car.class);
        carRepository.save(car);
    }
}