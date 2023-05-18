package kodla.io.rentAcar.wepApi.controllers;

import kodla.io.rentAcar.business.abstracts.CarService;
import kodla.io.rentAcar.dto.requests.CreateCarRequest;
import kodla.io.rentAcar.dto.requests.UpdateCarRequest;
import kodla.io.rentAcar.dto.responses.GetAllCarsResponse;
import kodla.io.rentAcar.dto.responses.GetByIdCarResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
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

    @GetMapping("/get/{id}")
    GetByIdCarResponse getById(@PathVariable int id) {
        return carService.getById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody UpdateCarRequest updateCarRequest) {
        this.carService.update(updateCarRequest);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        this.carService.delete(id);
    }


}
