package com.google.guiceexample;

import com.google.guiceexample.module.BillingModule;
import com.google.guiceexample.service.BillingService;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceMain {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new BillingModule());
        BillingService billingService = injector.getInstance(BillingService.class);
    }
}

