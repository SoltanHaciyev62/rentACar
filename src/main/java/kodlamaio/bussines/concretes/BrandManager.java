package kodlamaio.bussines.concretes;

import kodlamaio.DataAcces.abstracts.BrandRepository;
import kodlamaio.bussines.abstracts.BrandService;
import kodlamaio.entites.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BrandManager implements BrandService {
    private final BrandRepository brandRepository;

    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        return brandRepository.getAll();
    }
}
