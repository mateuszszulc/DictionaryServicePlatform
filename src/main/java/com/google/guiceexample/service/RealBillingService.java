package com.google.guiceexample.service;

import com.google.guiceexample.ChargeResult;
import com.google.guiceexample.Receipt;
import com.google.guiceexample.cards.CreditCard;
import com.google.guiceexample.logger.TransactionLog;
import com.google.guiceexample.orders.PizzaOrder;
import com.google.guiceexample.processor.CreditCardProcessor;
import com.google.inject.Inject;

public class RealBillingService implements BillingService {
    private final CreditCardProcessor processor;
    private final TransactionLog transactionLog;

    @Inject
    public RealBillingService(CreditCardProcessor processor,
                              TransactionLog transactionLog) {
        this.processor = processor;
        this.transactionLog = transactionLog;
    }

    public Receipt chargeOrder(PizzaOrder order, CreditCard creditCard) {
        ChargeResult result = processor.charge(creditCard, order.getAmount());
        transactionLog.logChargeResult(result);

        return result.wasSuccessful()
                ? Receipt.forSuccessfulCharge(order.getAmount())
                : Receipt.forDeclinedCharge(result.getDeclineMessage());
    }
}