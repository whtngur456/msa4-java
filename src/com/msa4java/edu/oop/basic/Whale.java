package com.msa4java.edu.oop.basic;

public class Whale {
    // Class는 Field와 Method로 구성되어 있다.
    public String name = "고래"; //filed
    public static int age = 20;

    // Method
    public void swimming() {
        System.out.println("고래가 헤엄칩니다");
    }

    //static Method
    public static void breath(String str) {
        System.out.println(str + "고래가 폐호흡합니다");
    }
}
