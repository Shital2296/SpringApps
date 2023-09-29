package in.shital.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.shital.binding.Product;
import in.shital.entity.ProductEntity;
import in.shital.repo.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repo;
	
	public boolean saveProduct(Product product) {
		ProductEntity entity=new ProductEntity();
		BeanUtils.copyProperties(product, entity);
		repo.save(entity);
		return true;
	}
}
