package kodlamaio.WebApi.controllers;

import kodlamaio.bussines.abstracts.BrandService;
import kodlamaio.entites.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandsControllers {
private BrandService brandService;
     @Autowired
    public BrandsControllers(BrandService brandService) {
        this.brandService = brandService;
    }
    @GetMapping("/getall")
    public List<Brand> getAll(){
        return  brandService.getAll();
    }
}
