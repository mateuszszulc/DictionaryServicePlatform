package com.google.guiceexample.processor;

import com.google.guiceexample.ChargeResult;
import com.google.guiceexample.cards.CreditCard;

/**
 * Created with IntelliJ IDEA.
 * User: mateusz.szulc
 * Date: 01.02.13
 * Time: 12:01
 * To change this template use File | Settings | File Templates.
 */
public interface CreditCardProcessor {
    ChargeResult charge(CreditCard creditCard, Object amount);
}
