package com.msa4java.edu;

public class E04For {
    public static void main(String[] args) {
        int dan = 2;
        for(int i = dan; i <= 9; i++) {
            String strDan = String.format("** %d단 **", i);
            System.out.println(strDan);
            for(int z = 1; z<= 9; z++) {
                String strMulti = String.format("%d x %d = %d", i, z, i * z);
                System.out.println(strMulti);
                }
            }
        }
    }