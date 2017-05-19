package com.czy.InterFace;

import java.util.Date;

public interface DateUtils {
  /**
   * 获取当天最后一秒时间
   * @param date
   * @return
   * @throws Exception 
   */
  Date getLastTime(Date date) throws Exception;
}
