package com.nttdata.credit.product.management.ms.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum TypeOfCredit {

  @JsonProperty("PERSONAL")
  PERSONAL("PERSONAL"),
  @JsonProperty("ENTERPRISE")
  ENTERPRISE("ENTERPRISE"),
  @JsonProperty("PERSONAL_CREDIT_CARD")
  PERSONAL_CREDIT_CARD("PERSONAL_CREDIT_CARD"),
  @JsonProperty("ENTERPRISE_CREDIT_CARD")
  ENTERPRISE_CREDIT_CARD("ENTERPRISE_CREDIT_CARD");

  private final String value;

  TypeOfCredit(String value) {this.value = value; }

  public static TypeOfCredit fromValue(String text) {
    for (TypeOfCredit b : TypeOfCredit.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

}
