package com.example.test.app;


/**
 * Created by hutao on 2014-5-14.
 */
public class Tools {

    public static String operateString(String valStr, char c) {
        int index;
        StringBuilder strBuf = new StringBuilder(valStr);
        int i = strBuf.length();
        if (i % 2 == 0) {
            i = (i - 1) / 2;
        }
        else {
            i = i / 2;
        }
        for (int j = 1; j <= i; j++) {
            index = 3 * j - 1;
            strBuf.insert(index, c);
        }
        return strBuf.toString();
    }
}
