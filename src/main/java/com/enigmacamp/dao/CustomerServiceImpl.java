package com.enigmacamp.dao;

import com.enigmacamp.customerdata.CustomerData;
import com.enigmacamp.service.CustomerService;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CustomerServiceImpl implements CustomerService {


    @Override
    public List <CustomerData>  addCustomer() {
        List<CustomerData> customers = Arrays.asList(
                createCustomer("Alice Johnson", 34, 2400.50, "baik"),
                createCustomer("Bob Smith", 22, 1500.00, "baik"),
                createCustomer("Charlie Davis", 41, 5600.25, "netral"),
                createCustomer("Diana Reed", 29, 2900.75, "buruk"),
                createCustomer("Ethan Fox", 37, 4700.00, "baik"),
                createCustomer("Fiona Green", 45, 3200.50, "netral"),
                createCustomer("George White", 31, 1500.00, "buruk")
        );
        return customers;
    }

    private CustomerData createCustomer(String name, int age, double savingBalance, String creditStatus) {
        CustomerData customer = new CustomerData(name, age, savingBalance, creditStatus);
        customer.setName(name);
        customer.setAge(age);
        customer.setSavingBalance(savingBalance);
        customer.setCreditStatus(creditStatus);
        return customer;
    }


    @Override
    public void listCountCustomer(List<CustomerData> customers) {
        //listCountCustomer
        Long count = customers.stream()
                .count();
        System.out.println("Jumlah pelanggan: " + count);
    }

    @Override
    public void saldoTotalCustomer(List<CustomerData> customerData) {
        double totalSaldo = customerData.stream()
                .mapToDouble(CustomerData::getSavingBalance)
                .sum();
        System.out.println("Total saldo: " + totalSaldo);
    }

    @Override
    public void averageTotalCustomer(List<CustomerData> customerData) {
        double averageSaldo = customerData.stream()
                .mapToDouble(CustomerData::getSavingBalance)
                .average().orElse(0.0);
        System.out.println("Rata-rata saldo: " + averageSaldo);
    }

    @Override
    public void minSaldoCustomer(List<CustomerData> customerData) {

        Optional<Double> minSaldo = customerData.stream().map(CustomerData::getSavingBalance).min(Double::compareTo);
        System.out.println("Minimum saldo: " + minSaldo);
    }

    @Override
    public void listCreditCustomer(List<CustomerData> customerData) {

    }

    @Override
    public void listCustomerLongers(List<CustomerData> customerData) {

    }
}
