package com.playtomic.tests.wallet.service;

import java.math.BigDecimal;

public interface PaymentService {
    void charge(BigDecimal amount) throws PaymentServiceException;
}
