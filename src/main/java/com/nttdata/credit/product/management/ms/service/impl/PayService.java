package com.nttdata.credit.product.management.ms.service.impl;

import com.nttdata.credit.product.management.ms.entity.payments.Payments;
import com.nttdata.credit.product.management.ms.repository.PayRepository;
import com.nttdata.credit.product.management.ms.service.inter.PayInterface;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Mono;

public class PayService implements PayInterface {

  @Autowired
  PayRepository payRepository;
  @Override
  public Mono<Payments> addPay(String productId, Payments pay) {
    pay.setProductId(productId);
    return payRepository.save(pay);
  }
}
