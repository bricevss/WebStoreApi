package com.m2i.WebStoreApiV2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.m2i.WebStoreApiV2.entity.PaypalPayment;

public interface PaypalPaymentRepository extends JpaRepository<PaypalPayment, Integer>{

}
