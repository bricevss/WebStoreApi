package com.m2i.WebStoreApiV2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.m2i.WebStoreApiV2.entity.UserInformations;

public interface UserInformationsRepository extends JpaRepository<UserInformations, Integer>{}