package kodla.io.rentAcar.business.abstracts;

import kodla.io.rentAcar.dto.responses.GetAllModelsResponse;

import java.util.List;

public interface ModelService {
    List<GetAllModelsResponse> getAll();
}
