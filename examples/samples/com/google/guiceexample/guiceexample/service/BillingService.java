package com.google.guiceexample.guiceexample.service;

import com.google.guiceexample.guiceexample.Receipt;
import com.google.guiceexample.guiceexample.cards.CreditCard;
import com.google.guiceexample.guiceexample.orders.PizzaOrder;

public interface BillingService {

    /**
     * Attempts to charge the order to the credit card. Both successful and
     * failed transactions will be recorded.
     *
     * @return a receipt of the transaction. If the charge was successful, the
     *      receipt will be successful. Otherwise, the receipt will contain a
     *      decline note describing why the charge failed.
     */
    Receipt chargeOrder(PizzaOrder order, CreditCard creditCard);
}