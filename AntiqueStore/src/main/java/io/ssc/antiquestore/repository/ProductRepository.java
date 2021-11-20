package io.ssc.antiquestore.repository;

import io.ssc.antiquestore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
