package com.endava.springc5e3.repositories;

import com.endava.springc5e3.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository
 * CrudRepository
 * PagingAndSortingRepository
 * <p>
 * JpaRepository, MongoRepository
 */

public interface ProductRepository extends JpaRepository<Product, Integer> {
//    List<Product> findProductByNameAnd(String name)
}
