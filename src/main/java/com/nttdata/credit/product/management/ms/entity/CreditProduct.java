package com.nttdata.credit.product.management.ms.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Document("creditProduct")
public class CreditProduct implements Serializable {

  @Id
  private String creditId;
  private TypeOfCredit typeOfCredit;
  private String clientId;
  private BigDecimal amount;
}
