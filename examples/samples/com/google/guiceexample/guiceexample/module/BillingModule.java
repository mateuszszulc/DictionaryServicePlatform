package com.google.guiceexample.guiceexample.module;

import com.google.guiceexample.guiceexample.logger.DatabaseTransactionLog;
import com.google.guiceexample.guiceexample.logger.TransactionLog;
import com.google.guiceexample.guiceexample.processor.CreditCardProcessor;
import com.google.guiceexample.guiceexample.processor.PaypalCreditCardProcessor;
import com.google.guiceexample.guiceexample.service.BillingService;
import com.google.guiceexample.guiceexample.service.RealBillingService;
import com.google.inject.AbstractModule;

public class BillingModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(TransactionLog.class).to(DatabaseTransactionLog.class);
        bind(CreditCardProcessor.class).to(PaypalCreditCardProcessor.class);
        bind(BillingService.class).to(RealBillingService.class);
    }
}