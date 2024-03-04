package com.nttdata.credit.product.management.ms.controller;

import com.nttdata.credit.product.management.ms.entity.CreditProduct;
import com.nttdata.credit.product.management.ms.service.impl.CreditProductService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/credit-product")
public class CreditProductController {

  private CreditProductService creditProductService;

  @GetMapping
  public Flux<CreditProduct> getAllCreditProduct() {
    return creditProductService.getAll();
  }

  @GetMapping("/{id}")
  public Mono<CreditProduct> getByIdCreditProduct(@PathVariable String id) {
    return creditProductService.getById(id);
  }

  @PostMapping
  public Mono<CreditProduct> createCreditProduct(@RequestBody CreditProduct request) {
    return creditProductService.create(request);
  }

  @PutMapping("/{id}")
  public Mono<CreditProduct> updateCreditProduct(@PathVariable String id, @RequestBody CreditProduct request) {
    return creditProductService.update(id, request);
  }

  @DeleteMapping("/{id}")
  public Mono<Void> deleteCreditProduct(@PathVariable String id) {
    return creditProductService.delete(id);
  }
}
