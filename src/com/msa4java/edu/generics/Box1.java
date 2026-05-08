package com.msa4java.edu.generics;

public class Box1 {
    public int[] arr = new int[10];

    public void add(int val) {
        int idx = this.arr.length -1;
        this.arr[idx]= val;
    }
}
