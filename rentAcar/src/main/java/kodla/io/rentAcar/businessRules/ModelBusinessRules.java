package kodla.io.rentAcar.businessRules;

import kodla.io.rentAcar.core.utilities.exceptions.BusinessException;
import kodla.io.rentAcar.dataAccess.abstracts.ModelRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ModelBusinessRules {
    private ModelRepository modelRepository;

    public void checkIfModelNameExists(String modelName) {
        if(this.modelRepository.existsByModelName(modelName)){
            throw new BusinessException("Model name already exists !");
        }
    }
}
