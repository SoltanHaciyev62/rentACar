package kodlamaio.DataAcces.abstracts;

import kodlamaio.entites.concretes.Brand;

import java.util.List;

public interface BrandRepository {
    List<Brand> getAll();
}
