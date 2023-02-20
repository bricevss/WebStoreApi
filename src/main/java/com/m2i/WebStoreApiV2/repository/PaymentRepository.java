package com.m2i.WebStoreApiV2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.m2i.WebStoreApiV2.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}
