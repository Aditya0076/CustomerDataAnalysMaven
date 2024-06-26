package com.enigmacamp.service;

import com.enigmacamp.customerdata.CustomerData;

import java.util.List;

public interface CustomerService {

    List <CustomerData> addCustomer ();
    void listCountCustomer(List <CustomerData> customerData);
    void saldoTotalCustomer(List <CustomerData> customerData);
    void averageTotalCustomer(List <CustomerData> customerData);
    void minSaldoCustomer(List <CustomerData> customerData);
    void listCreditCustomer(List <CustomerData> customerData);
    void listCustomerLongers(List <CustomerData> customerData);
}
