package kodla.io.rentAcar.dto.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateModelRequest {
    @NotNull
    @NotBlank
    private int brandId;
    @NotNull
    @NotBlank
    private int modelId;
    @NotNull
    @NotBlank
    private String modelName;

}
