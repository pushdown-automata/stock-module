package com.tmax.commerce.stock.entity.product;

import com.tmax.commerce.stock.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class ProductStock extends BaseEntity {
    @Id
    private Long id;

}
