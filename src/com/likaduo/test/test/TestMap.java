package com.likaduo.test.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TestMap {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<Integer, String>();

        map.put(1,"nihao1");
        map.put(2,"nihao2");
        map.put(3,"nihao3");
        map.put(4,"nihao4");
        map.put(5,"nihao5");
        map.put(6,"nihao6");
        map.put(7,"nihao7");
        map.put(8,"nihao8");
        map.put(9,"nihao9");

        List<String> list = new ArrayList<String>();
        list.add("21212");
        list.add("21212");
        list.add("21212");
        list.add("21212");
        list.add("21212");
        list.add("21212");
        list.add("21212");
        list.add("21212");
        list.add("21212");


        for (Map.Entry<Integer,String> entry : map.entrySet()
             ) {
            Integer key = entry.getKey();
            String values = entry.getValue();

            System.out.println(key + values);
        }


        for (String l: list
             ) {
            System.out.println(l);
        }

    }



}
