package com.nttdata.credit.product.management.ms.repository;

import com.nttdata.credit.product.management.ms.entity.payments.Payments;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PayRepository extends ReactiveMongoRepository<Payments, String> {
}
