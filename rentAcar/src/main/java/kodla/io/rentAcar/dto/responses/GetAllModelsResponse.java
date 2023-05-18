package kodla.io.rentAcar.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllModelsResponse {
    private int modelId;
    private String modelName;
    private int brandId;
    private String brandName;

//    public GetAllModelsResponse(Model model) {
//        this.modelName = model.getModelName();
//        this.modelId = model.getModelId();
//        this.brandName = model.getBrand().getBrandName();
//        this.brandId = model.getBrand().getBrandId();
//
//    }
}
