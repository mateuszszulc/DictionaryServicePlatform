package com.google.guiceexample.module;

import com.google.guiceexample.logger.DatabaseTransactionLog;
import com.google.guiceexample.logger.TransactionLog;
import com.google.guiceexample.processor.CreditCardProcessor;
import com.google.guiceexample.processor.PaypalCreditCardProcessor;
import com.google.guiceexample.service.BillingService;
import com.google.guiceexample.service.RealBillingService;
import com.google.inject.AbstractModule;

public class BillingModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(TransactionLog.class).to(DatabaseTransactionLog.class);
        bind(CreditCardProcessor.class).to(PaypalCreditCardProcessor.class);
        bind(BillingService.class).to(RealBillingService.class);
    }
}