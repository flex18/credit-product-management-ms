package com.nttdata.credit.product.management.ms.service.impl;

import com.nttdata.credit.product.management.ms.entity.CreditProduct;
import com.nttdata.credit.product.management.ms.repository.CreditProductRepository;
import com.nttdata.credit.product.management.ms.service.inter.CreditProductInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CreditProductService implements CreditProductInterface {

  @Autowired
  CreditProductRepository creditProductRepository;

  @Override
  public Flux<CreditProduct> getAll() {
    return creditProductRepository.findAll();
  }

  @Override
  public Mono<CreditProduct> getById(String id) {
    return creditProductRepository.findById(id);
  }

  @Override
  public Mono<CreditProduct> create(CreditProduct request) {
    return creditProductRepository.save(request);
  }

  @Override
  public Mono<CreditProduct> update(String id, CreditProduct request) {
    return creditProductRepository.findById(id)
        .flatMap(cpUpdate -> {
          cpUpdate.setTypeOfCredit(request.getTypeOfCredit());
          cpUpdate.setClientId(request.getClientId());
          cpUpdate.setAmount(request.getAmount());
          return creditProductRepository.save(cpUpdate);
        });
  }

  @Override
  public Mono<Void> delete(String id) {
    return creditProductRepository.deleteById(id);
  }
}
