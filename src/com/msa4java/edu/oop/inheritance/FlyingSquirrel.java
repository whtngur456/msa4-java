package com.msa4java.edu.oop.inheritance;

public class FlyingSquirrel extends Mammal {
    public FlyingSquirrel(String name, String residence) {
        this.name = name;
        this.residence = residence;
    }

    public void flying() {
        System.out.println(this.name + "이/가 날아갑니다.");
    }
    public void breath() {
        super.breath(); //생략가능
        System.out.println(this.name + "이/가 숨을 참고 날아갑니다");

    }
}
