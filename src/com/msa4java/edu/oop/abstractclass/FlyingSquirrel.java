package com.msa4java.edu.oop.abstractclass;

public class FlyingSquirrel extends Mammal {
    public FlyingSquirrel(String name) {
        super(name, "산");
    }

    @Override
    public void residence() {
        String result = String.format("%s %s에 삽니다.", this.name, this.residence);
        System.out.println(result);
    }
}