package com.marry.patterns.builder;

public class BuilderApp {
    public static void main(String[] args) {
       // BankAccount bankAccount = new BankAccount();

        BankAccount bankAccount = new BankAccount.Builder(56345634,"Mary")
//                .setAccountNumber(345234)
                .setBalance(3434d)
                .setBranch("some branch")
                .setInterestRate(4444)
//                .setOwner("Mary")
                .build();


        System.out.println();
    }
}
