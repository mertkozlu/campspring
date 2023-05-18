package kodla.io.rentAcar.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCarsResponse {
    private int carId;
    private String plate;
    private double dailyPrice;
    private int modelYear;
    private String state;
    private int modelId;
    private String modelName;
    private int brandId;
    private String brandName;

}
