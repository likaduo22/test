package com.likaduo.test.thred;

import java.util.ArrayList;
import java.util.List;

public class TestString {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        for(int i = 0;i<1000000;i++) {

            list.add("nihao!!!");

        };

       long start = System.currentTimeMillis();
        int size = list.size();
       for(int j = 0 ; j<size; j++){

           System.out.println(list.get(j));

       }
       long end = System.currentTimeMillis();

        System.out.println("时间"+(end - start));

    }





}
