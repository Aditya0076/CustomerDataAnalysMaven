package com.enigmacamp.menu;

import com.enigmacamp.customerdata.CustomerData;
import com.enigmacamp.dao.CustomerServiceImpl;
import com.enigmacamp.service.CustomerService;

import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    public void displayMenu() {
        System.out.println("1. List Customer");
        System.out.println("2. List Count Customer");
        System.out.println("3. Saldo Total Customer");
        System.out.println("4. List Credit Customer");
        System.out.println("5. List Customer Longers");
        System.out.println("6. Average Total Customer");
        System.out.println("7. Min Saldo Customer");
        System.out.println("8. Exit");
    }

    public void mainMenu() {
        int menu;
        do {
            System.out.println("Selamat Datang di Bank Enigma");
            System.out.println("-".repeat(50));
            displayMenu();
            System.out.println("Silahkan pilih menu yang diinginkan:");
            menu = input.nextInt();
            switch (menu) {
                case 1:
                    listCustomer();
                    break;
                case 2:
                    listCountCustomer();
                    break;
                case 3:
                    saldoTotalCustomer();
                    break;
                case 4:
                    listCreditCustomer();
                    break;
                case 5:
                    listCustomerLongers();
                    break;
                case 6:
                    averageTotalCustomer();
                    break;
                case 7:
                    minSaldoCustomer();
                    break;
                case 8:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
                    break;
            }
        }while (menu!=8);

    }

    public void listCustomer() {
        CustomerServiceImpl customerData = new CustomerServiceImpl();
        customerData.addCustomer();
        System.out.println("Daftar Nasabah: ");
        List<CustomerData> customers = customerData.addCustomer();
        customers.stream()
                .map(CustomerData::getName)
                .forEach(System.out::println);
    }
    public void listCountCustomer(){
        CustomerServiceImpl customerData = new CustomerServiceImpl();
        customerData.listCountCustomer(customerData.addCustomer());
    }
    public void saldoTotalCustomer(){
        CustomerServiceImpl customerData = new CustomerServiceImpl();
        customerData.saldoTotalCustomer(customerData.addCustomer());
    }
    public void listCreditCustomer(){
        CustomerServiceImpl customerData = new CustomerServiceImpl();
        customerData.listCreditCustomer(customerData.addCustomer());
    }
    public void listCustomerLongers(){
        CustomerServiceImpl customerData = new CustomerServiceImpl();
        customerData.listCustomerLongers(customerData.addCustomer());
    }
    public void averageTotalCustomer(){
        CustomerServiceImpl customerData = new CustomerServiceImpl();
        customerData.averageTotalCustomer(customerData.addCustomer());
    }
    public void minSaldoCustomer(){
        CustomerServiceImpl customerData = new CustomerServiceImpl();
        customerData.minSaldoCustomer(customerData.addCustomer());
    }
}
