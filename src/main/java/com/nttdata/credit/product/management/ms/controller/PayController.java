package com.nttdata.credit.product.management.ms.controller;

import com.nttdata.credit.product.management.ms.entity.payments.Payments;
import com.nttdata.credit.product.management.ms.service.impl.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/payments")
public class PayController {

  @Autowired
  PayService payService;

  @PostMapping("/{id}")
  public Mono<Payments> makePayment(@PathVariable String productId, @RequestBody Payments request){
    return payService.addPay(productId, request);
  }
}
