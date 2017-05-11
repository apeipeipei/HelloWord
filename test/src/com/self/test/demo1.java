package com.self.test;

public class demo1 {
  public static void main(String[] args) {
    int m = 100;
    int p = 0;
    int count = 0;
     count = shoop(m,p,count);
     System.out.println(count);
  }
  public static int shoop(int m,int p,int count){
    
    if(p >= 2){
      count += 1;
      p -=1;
    }else if(m>0){
      count +=1;
      p += 1;
      m -= 1;
    }else if(m == 0 && p < 2){
      return count;
    }
    return shoop(m,p,count);
  }
}
