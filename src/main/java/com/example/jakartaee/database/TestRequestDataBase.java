package com.example.jakartaee.database;

public class TestRequestDataBase {
    public static void main(String[] args) {
        WorkDataBase workDataBase = new WorkDataBase();
        Account account = workDataBase.getAccount(1L);
        System.out.println(account.getLogin());

    }
}
