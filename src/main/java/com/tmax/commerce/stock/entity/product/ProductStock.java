package com.tmax.commerce.stock.entity.product;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class ProductStock {
    @Id
    private Long id;

}
