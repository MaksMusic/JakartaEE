package com.example.jakartaee.database;

public class TestRequestDataBase {
    public static void main(String[] args) {
        WorkDataBase workDataBase = new WorkDataBase();
        Account account = workDataBase.getAccountById(1L);
        //  System.out.println(account.getLogin());

        workDataBase.getAccounts().forEach(System.out::println);
        for (Account dataBaseAccount : workDataBase.getAccounts()) {
            System.out.println(dataBaseAccount.getLogin());
        }

    }
}
