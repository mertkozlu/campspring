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
    private int modelId;
    @NotNull
    @NotBlank
    private String plate;
    @NotNull
    private double dailyPrice;
    @NotNull
    private int modelYear;
    @NotNull
    @NotBlank
    private String state;

}
