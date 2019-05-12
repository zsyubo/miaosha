package org.imooc.mall.util;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * md5 加密类
 *
 * @author hyf
 * @date 2019-05-11
 **/
public class MD5Util {

    private static final String salt = "1a2b3c4d";

    public static String md5(String src) {
        return DigestUtils.md5Hex(src);
    }

    public static String inputPassFormPass(String inputPass) {
        String str = salt.charAt(0) + salt.charAt(2) + inputPass + salt.charAt(5) + salt.charAt(4);
        return md5(str);
    }

    public static String inputPassToDBPass(String formPass, String salt) {
        String str = salt.charAt(0) + salt.charAt(2) + formPass + salt.charAt(5) + salt.charAt(4);
        return md5(str);
    }

    public static void main(String[] args) {
        System.out.println(inputPassToDBPass(inputPassFormPass("123456"), salt));

    }

}
