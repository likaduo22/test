package com.likaduo.test.test;

import java.util.StringTokenizer;

public class TestStringkenizer {

    public static void main(String[] args) {

        String s = new String("sssfdf,dsfsdf,sdfds,fdsf,sdf");

        StringTokenizer st = new StringTokenizer(s,",");

        System.out.println( "Token Total: " + st.countTokens() );

        while( st.hasMoreElements() ){
            System.out.println(st.nextToken());
        }

    }

}
