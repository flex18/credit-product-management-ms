package com.nttdata.credit.product.management.ms.repository;

import com.nttdata.credit.product.management.ms.entity.CreditProduct;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CreditProductRepository extends ReactiveMongoRepository<CreditProduct, String> {
}
