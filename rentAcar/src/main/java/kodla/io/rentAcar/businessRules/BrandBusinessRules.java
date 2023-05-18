package kodla.io.rentAcar.businessRules;

import kodla.io.rentAcar.core.utilities.exceptions.BusinessException;
import kodla.io.rentAcar.dataAccess.abstracts.BrandRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BrandBusinessRules {
    private BrandRepository brandRepository;

    public void checkIfBrandNameExists(String brandName) {
        if (this.brandRepository.existsByBrandName(brandName)) {
            throw new BusinessException("Brand name already exists !"); //Java exception types
        }

    }
}
