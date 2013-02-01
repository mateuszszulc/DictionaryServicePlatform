package com.google.guiceexample.logger;

import com.google.guiceexample.ChargeResult;
import com.google.guiceexample.exceptions.UnreachableException;

/**
 * Created with IntelliJ IDEA.
 * User: mateusz.szulc
 * Date: 01.02.13
 * Time: 12:01
 * To change this template use File | Settings | File Templates.
 */
public interface TransactionLog {
    void logChargeResult(ChargeResult result);

    void logConnectException(UnreachableException e);
}
