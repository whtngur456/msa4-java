package com.msa4java.edu.oop.basic;

public class AccessModifier {
    //접근제어 지시자 : 외부에서의 접근을 통제하기위해 필드 or 메소드 앞에 작성하는 키워드
    public int numPubli=1; //내/외부 어디에서나 접근 가능
    protected int numProtected=2;// 같은 패키지 & class내부 &자식클래스에서 접근가능
    private int numPrivate=3; // 클래스 내부에서만 접근가능
    int numDefault=4; //같은 패키지에 소속된 클래스에서 접근 가능//앞에Default를 생략

}
