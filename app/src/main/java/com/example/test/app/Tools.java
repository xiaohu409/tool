package com.example.test.app;

/**
 * Created by hutao on 2014-5-14.
 */
public class Tools {

    public static String operateString(String valStr, char c) {
        StringBuilder strBuf = new StringBuilder(valStr);
        int i = strBuf.length() / 2;
        int index;
        for (int j = 1; j <= i; j++) {
            index = 3 * j - 1;
            strBuf.insert(index, c);
        }
        return strBuf.toString();
    }

}
