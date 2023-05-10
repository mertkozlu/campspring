package kodla.io.rentAcar.business.rules;

import kodla.io.rentAcar.core.utilities.exceptions.BusinessException;
import kodla.io.rentAcar.dataAccess.abstracts.BrandRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BrandBusinessRules {
    private BrandRepository brandRepository;

    public void checkIfBrandNameExists(String name) {
        if (this.brandRepository.existsByName(name)) {
            throw new BusinessException("Brand name already exists"); //Java exception types
        }

    }
}
