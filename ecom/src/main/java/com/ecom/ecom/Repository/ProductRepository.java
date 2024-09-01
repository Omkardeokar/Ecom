package com.ecom.ecom.Repository;

import com.ecom.ecom.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
