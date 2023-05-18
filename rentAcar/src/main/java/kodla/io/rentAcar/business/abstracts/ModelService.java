package kodla.io.rentAcar.business.abstracts;

import kodla.io.rentAcar.dto.requests.CreateModelRequest;
import kodla.io.rentAcar.dto.requests.UpdateModelRequest;
import kodla.io.rentAcar.dto.responses.GetAllModelsResponse;
import kodla.io.rentAcar.dto.responses.GetByIdModelResponse;

import java.util.List;

public interface ModelService {
    List<GetAllModelsResponse> getAll();

    void add(CreateModelRequest createModelRequest);

    GetByIdModelResponse getById(int id);

    void update(UpdateModelRequest updateModelRequest);

    void delete(int id);
}
