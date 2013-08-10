package com.hyc.tdd;

/**
 * Created with IntelliJ IDEA.
 * User: morain
 * Date: 13-8-8
 * Time: 下午9:53
 * To change this template use File | Settings | File Templates.
 */
public class LeapYear {

    public static boolean isLeapYear(int year_in) {
        if (year_in % 100 == 0 && year_in % 400 != 0) {
            return false;
        }
        return (year_in % 4 == 0);
    }

}
