package kodla.io.rentAcar.dto.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCarRequest {
    @NotNull
    @NotBlank
    private int modelId;
    @NotNull
    @NotBlank
    private String plate;
    @NotNull
    @NotBlank
    private double dailyPrice;
    @NotNull
    @NotBlank
    private int modelYear;
    @NotNull
    @NotBlank
    private String state;

}
