package kodlamaio.DataAcces.concretes;

import kodlamaio.DataAcces.abstracts.BrandRepository;
import kodlamaio.entites.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InMemoryBrandRepository implements BrandRepository {

    List<Brand> brands;

    public InMemoryBrandRepository() {
        brands = new ArrayList<Brand>();
        brands.add(new Brand(1,"BMW"));
        brands.add(new Brand(2,"Mercedes"));
        brands.add(new Brand(3,"Toyota"));
        brands.add(new Brand(4, "Porshe"));

    }

    @Override
    public List<Brand> getAll() {
        return brands;
    }
}
