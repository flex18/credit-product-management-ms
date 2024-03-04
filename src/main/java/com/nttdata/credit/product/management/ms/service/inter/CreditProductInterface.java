package com.nttdata.credit.product.management.ms.service.inter;

import com.nttdata.credit.product.management.ms.entity.CreditProduct;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditProductInterface {

  Flux<CreditProduct> getAll();
  Mono<CreditProduct> getById(String id);
  Mono<CreditProduct> create(CreditProduct request);
  Mono<CreditProduct> update(String id, CreditProduct request);
  Mono<Void> delete(String id);
}
