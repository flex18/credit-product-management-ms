package com.nttdata.credit.product.management.ms.entity;

import java.math.BigDecimal;

public class CreditProduct {

  private String creditId;
  private TypeOfCredit typeOfCredit; // Personal o Enterprise
  private String clientId;
  private BigDecimal amount;
}
