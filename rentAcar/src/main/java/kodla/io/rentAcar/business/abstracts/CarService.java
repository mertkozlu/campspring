package kodla.io.rentAcar.business.abstracts;

import kodla.io.rentAcar.dto.requests.CreateCarRequest;
import kodla.io.rentAcar.dto.requests.UpdateCarRequest;
import kodla.io.rentAcar.dto.responses.GetAllCarsResponse;
import kodla.io.rentAcar.dto.responses.GetByIdCarResponse;

import java.util.List;

public interface CarService {
    List<GetAllCarsResponse> getAll();

    void add(CreateCarRequest createCarRequest);

    GetByIdCarResponse getById(int id);

    void update(UpdateCarRequest updateCarRequest);

    void delete(int id);

}
