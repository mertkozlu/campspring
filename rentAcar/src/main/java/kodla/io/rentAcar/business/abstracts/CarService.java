package kodla.io.rentAcar.business.abstracts;

import kodla.io.rentAcar.dto.requests.CreateCarRequest;
import kodla.io.rentAcar.dto.responses.GetAllCarsResponse;

import java.util.List;

public interface CarService {
    List<GetAllCarsResponse> getAll();

    void add(CreateCarRequest createCarRequest);
}
