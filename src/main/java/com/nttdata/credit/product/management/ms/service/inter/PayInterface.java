package com.nttdata.credit.product.management.ms.service.inter;

import com.nttdata.credit.product.management.ms.entity.payments.Payments;
import reactor.core.publisher.Mono;

public interface PayInterface {

  Mono<Payments> addPay(String productId, Payments pay);
}
