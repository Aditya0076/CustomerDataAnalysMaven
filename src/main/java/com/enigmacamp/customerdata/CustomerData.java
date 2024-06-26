package com.enigmacamp.customerdata;

public class CustomerData {
    private  String name;
    private  int age;
    private  double savingBalance;
    private  String creditStatus;

    public CustomerData(String name, int age, double savingBalance, String creditStatus) {
        this.name = name;
        this.age = age;
        this.savingBalance = savingBalance;
        this.creditStatus = creditStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public String getCreditStatus() {
        return creditStatus;
    }

    public void setCreditStatus(String creditStatus) {
        this.creditStatus = creditStatus;
    }
}
