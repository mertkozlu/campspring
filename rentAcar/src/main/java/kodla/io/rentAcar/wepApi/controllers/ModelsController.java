package kodla.io.rentAcar.wepApi.controllers;

import kodla.io.rentAcar.business.abstracts.ModelService;
import kodla.io.rentAcar.dto.requests.CreateModelRequest;
import kodla.io.rentAcar.dto.requests.UpdateModelRequest;
import kodla.io.rentAcar.dto.responses.GetAllModelsResponse;
import kodla.io.rentAcar.dto.responses.GetByIdModelResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/models")
@AllArgsConstructor
public class ModelsController {
    private ModelService modelService;

    @GetMapping("/getAll")
    public List<GetAllModelsResponse> getAll() {
        return modelService.getAll();
    }

    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody CreateModelRequest createModelRequest) {
        this.modelService.add(createModelRequest);
    }

    @GetMapping("/get/{id}")
    public GetByIdModelResponse getById(@PathVariable int id) {
        return modelService.getById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody UpdateModelRequest updateModelRequest) {
        this.modelService.update(updateModelRequest);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        this.modelService.delete(id);
    }


}
