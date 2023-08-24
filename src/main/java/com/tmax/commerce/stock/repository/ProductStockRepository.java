package com.tmax.commerce.stock.repository;

import com.tmax.commerce.stock.entity.product.ProductStock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductStockRepository extends JpaRepository<ProductStock, Long> {
}
