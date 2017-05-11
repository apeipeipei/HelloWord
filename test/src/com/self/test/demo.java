package com.self.test;

public class demo {
  public static void main(String[] args) {
    String name = " 你 ";
    System.out.println(name);
    if (CNorEN(name)) {
      String newName = name.replace(" ", "");
      System.out.println(newName);
    }else{
      String newName = name.trim();
      System.out.println(newName);
    }
    
  }
  public static boolean CNorEN(String name){
    
    if(name != null){ 
    for(char c : name.toCharArray()){
      if(isChinese(c))
        return true;
      }
    }
    return false;
  }
  //判断一个字符是否为中文
  public static boolean isChinese(char c){
    //根据字节码判断
    return c >= 0x4E00 && c <= 0x9FA5;
  }
}
