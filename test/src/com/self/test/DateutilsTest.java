package com.self.test;

import java.util.Date;

import com.czy.service.DateUtilsImpl;

public class DateutilsTest {
  public static void main(String[] args) throws Exception {
    DateUtilsImpl impl = new DateUtilsImpl();
    Date date = new Date();
    Date lastTime = impl.getLastTime(date);
    System.out.println(lastTime);
  }
}
