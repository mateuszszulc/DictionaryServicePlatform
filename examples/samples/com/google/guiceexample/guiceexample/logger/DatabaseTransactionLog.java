package com.google.guiceexample.guiceexample.logger;

import com.google.guiceexample.guiceexample.ChargeResult;
import com.google.guiceexample.guiceexample.exceptions.UnreachableException;

/**
 * Created with IntelliJ IDEA.
 * User: mateusz.szulc
 * Date: 01.02.13
 * Time: 12:01
 * To change this template use File | Settings | File Templates.
 */
public class DatabaseTransactionLog implements TransactionLog {
    @Override
    public void logChargeResult(ChargeResult result) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void logConnectException(UnreachableException e) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
