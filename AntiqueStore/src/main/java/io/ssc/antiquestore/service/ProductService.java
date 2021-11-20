package io.ssc.antiquestore.service;

import io.ssc.antiquestore.model.Product;
import io.ssc.antiquestore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;

	public List<Product> index() {
		return repository.findAll();
	}

	public void save(Product product) {
		repository.save(product);
	}

	public Product update(Integer id) {
		return repository.findById(id).get();
	}

	public void delete(Integer id) {
		repository.deleteById(id);
	}
}
