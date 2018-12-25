package com.marry.patterns.builder;

public class BankAccount {

    private long accountNumber;
    private String owner;
    private String branch;
    private double balance;
    private double interestRate;

    private BankAccount() {
    }

    public static class Builder{

        private long accountNumber;
        private String owner;
        private String branch;
        private double balance;
        private double interestRate;

        public Builder(long accountNumber, String owner) {
            this.accountNumber = accountNumber;
            this.owner = owner;
        }

        public Builder setAccountNumber(long accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public Builder setOwner(String owner) {
            this.owner = owner;
            return this;
        }

        public Builder setBranch(String branch) {
            this.branch = branch;
            return this;
        }

        public Builder setBalance(double balance) {
            this.balance = balance;
            return this;
        }

        public Builder setInterestRate(double interestRate) {
            this.interestRate = interestRate;
            return this;
        }

        public BankAccount build(){
            BankAccount bankAccount = new BankAccount();
            bankAccount.accountNumber = accountNumber;
            bankAccount.balance = balance;
            bankAccount.branch = branch;
            bankAccount.interestRate = interestRate;
            bankAccount.owner = owner;
            return bankAccount;
        }

    }





}
