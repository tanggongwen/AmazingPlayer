package com.mahuahudong.res;

public class CorrectUtils {

    public static boolean isMobileNO(String mobiles) {
        String telRegex = "^((1[3,5,7,8][0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";
        if (StringUtils.isEmpty(mobiles)) {
            return false;
        } else {
            return mobiles.matches(telRegex);
        }
    }

}
