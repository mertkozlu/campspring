package kodla.io.rentAcar.wepApi.controllers;

import kodla.io.rentAcar.business.abstracts.CarService;
import kodla.io.rentAcar.dto.requests.CreateCarRequest;
import kodla.io.rentAcar.dto.responses.GetAllCarsResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@AllArgsConstructor
public class CarsController {
    private CarService carService;

    @GetMapping("/getAll")
    public List<GetAllCarsResponse> getAll() {
        return carService.getAll();
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody CreateCarRequest createCarRequest) {
        this.carService.add(createCarRequest);
    }
}
