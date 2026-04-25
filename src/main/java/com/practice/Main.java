package com.practice;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");

    // Lỗi 1: Tên biến không theo chuẩn camelCase (có dấu gạch dưới)
    int so_thu_nhat = 10;

    // Lỗi 2: Thiếu khoảng trắng sau 'if' (chuẩn Google bắt buộc có dấu cách)
    if(so_thu_nhat > 0) {
      System.out.println(so_thu_nhat);
    }
  }
}