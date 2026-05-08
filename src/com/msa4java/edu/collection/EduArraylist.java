package com.msa4java.edu.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EduArraylist {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(10);

        list.add(1);
        list.add(2);
        list.add(5);
        list.add(4);

        System.out.println(list.get(3));

        //정렬
        Collections.sort(list);
        System.out.println(list.get(3));
        System.out.println(list.size());

        // 향상된 for 문
        for(int i : list) {
            System.out.println(i);
        }
        list.forEach((i) -> {
           System.out.println(i);
        });


    }
}
