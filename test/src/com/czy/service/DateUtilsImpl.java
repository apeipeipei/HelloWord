package com.czy.service;


import java.text.SimpleDateFormat;
import java.util.Date;

import com.czy.InterFace.DateUtils;

public class DateUtilsImpl implements DateUtils {
/**
 * 获取当天最后一秒时间
 */
  @Override
  public Date getLastTime(Date date) throws Exception{
    //年月日格式
    SimpleDateFormat ymd = new SimpleDateFormat("yyyy-MM-dd");
    //年月日时分秒格式
    //SimpleDateFormat ymdhms = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    //1.将日期格式转换为年月日字符串格式："yyyy-MM-dd"
    String ymdDate = ymd.format(date);
    //2.再将年月日格式的字符串转为Date类型
    Date newYmdDate = ymd.parse(ymdDate);
    //3.初始化一个整天的毫秒数
    int dateMin = 1000*60*60*24;
    //4.获取当天的毫秒
    long time = newYmdDate.getTime();
    
    
    //5.整天毫秒-1再加上当天毫秒为endTime
    long endTime1 = time - 1;
    //6.将endTime转为Date
    Date endTime2 = new Date(endTime1);
    //String format = ymdhms.format(endTime2);
    //Date endTime3 = ymdhms.parse(format);
    //7.返回Date
    return endTime2;
  }

}
