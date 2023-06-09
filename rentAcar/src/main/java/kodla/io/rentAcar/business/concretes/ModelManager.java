package kodla.io.rentAcar.business.concretes;

import kodla.io.rentAcar.business.abstracts.ModelService;
import kodla.io.rentAcar.businessRules.ModelBusinessRules;
import kodla.io.rentAcar.core.utilities.mappers.ModelMapperService;
import kodla.io.rentAcar.dataAccess.abstracts.ModelRepository;
import kodla.io.rentAcar.dto.requests.CreateModelRequest;
import kodla.io.rentAcar.dto.requests.UpdateModelRequest;
import kodla.io.rentAcar.dto.responses.GetAllModelsResponse;
import kodla.io.rentAcar.dto.responses.GetByIdModelResponse;
import kodla.io.rentAcar.entities.concretes.Model;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ModelManager implements ModelService {
    private ModelRepository modelRepository;
    private ModelMapperService modelMapperService;
    private ModelBusinessRules modelBusinessRules;
//    private BrandService brandService;

    @Override
    public List<GetAllModelsResponse> getAll() {

        List<Model> models = modelRepository.findAll();

        List<GetAllModelsResponse> modelsResponse = models.stream()
                .map(model -> this.modelMapperService.forResponse()
                        .map(model, GetAllModelsResponse.class)).collect(Collectors.toList());

        return modelsResponse;
    }

    @Override
    public void add(CreateModelRequest createModelRequest) {
        this.modelBusinessRules.checkIfModelNameExists(createModelRequest.getModelName());
        Model model = this.modelMapperService.forRequest()
                .map(createModelRequest, Model.class);
        modelRepository.save(model);
//        Brand brand = brandService.getOneBrandById(createModelRequest.getBrandId());
//
//        Model model = new Model();
//        model.setModelName(createModelRequest.getModelName());
//        model.setBrand(brand);
//        this.modelRepository.save(model);

    }

    @Override
    public GetByIdModelResponse getById(int id) {
        Model model = this.modelRepository.findById(id).orElseThrow();
        GetByIdModelResponse response = this.modelMapperService.forResponse()
                .map(model, GetByIdModelResponse.class);
        return response;
    }

    @Override
    public void update(UpdateModelRequest updateModelRequest) {
        Model model = this.modelMapperService.forRequest().map(updateModelRequest, Model.class);
        this.modelRepository.save(model);

    }

    @Override
    public void delete(int id) {
        this.modelRepository.deleteById(id);

    }
}
