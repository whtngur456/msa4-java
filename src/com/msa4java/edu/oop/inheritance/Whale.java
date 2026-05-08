package com.msa4java.edu.oop.inheritance;

public class Whale extends Mammal {
    public Whale(String name, String residence) {
        // super(); super메소드가 생략되어있다.
        // super() : 부모의 생성자를 호출하는 메소드
        this.name = name;
        this.residence = residence;
    }

    // 오버라이딩 : 자식 클래스에서 부모 클래스의 메소드를 재정의하는 것
    @Override
    public void breath() {
        // super 키워드 : 부모 클래스로부터 상속받은 필드나 메소드를 자식 클래스가 참조하기 위해 사용하는 참조변수
        super.breath();
        System.out.println(this.name + "이/가 폐호흡을 하고 숨을 잘 참습니다.");
    }

    public void swimming() {
        System.out.println(this.name + "이/가 헤엄칩니다.");
    }
}