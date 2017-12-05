package com.my.util;

/**
 * Created by zhoumengyu on 2017/12/5.
 */
public class StringUtils {
    /**
     * 去除重复相邻空格
     * @param str "AA  B CC    DD  EE"
     * @return "AA B CC DD EE"
     */
    public static String dealStrSpace(String str) {
        str = str.trim();
        int index = -1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == ' ') {
                if(index > 0 && index == i - 1) {
                    index = i;
                    continue;
                }
                index = i;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
