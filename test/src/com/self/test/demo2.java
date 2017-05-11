package com.self.test;

import java.math.BigDecimal;
import java.util.Date;

public class demo2 extends Date{
  public static void main(String[] args) {
    new demo2().add();
    BigDecimal value = BigDecimal.valueOf(Long.parseLong(null));
    System.out.println(value);
  }
  private void add(){
    System.out.println(super.getClass().getName());
  }
}
