package com.google.guiceexample.guiceexample;

/**
 * Created with IntelliJ IDEA.
 * User: mateusz.szulc
 * Date: 01.02.13
 * Time: 11:54
 * To change this template use File | Settings | File Templates.
 */
public class Receipt {
    public static Receipt forSuccessfulCharge(Object amount) {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    public static Receipt forSystemFailure(String message) {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    public static Receipt forDeclinedCharge(Object declineMessage) {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }
}
