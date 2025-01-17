// package com.Account;

import java.util.Scanner;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;


public class Account {
    // create account add function, retrieve info
    //save to dictionary

    //create account
    //name, age, account balance will start at 0, routing number(WHat i think to
    //be the key for their information)
    //print account information

    private String name;
    private int routing_number;
    private double checking_balance = 0.00;
    private double saving_balance = 0.00;
    // private Map<String, Integer, Double, Double> account = new Map<>();
    private Map<String, Object> account = new HashMap<>();
    private static Random rand = new Random();
    private static Scanner scan = new Scanner(System.in);
    
    public Account(String name, int routing_number, double checking_balance, double saving_balance) 
    {
        this.name = name;
        this.routing_number = routing_number;
        this.checking_balance = checking_balance;
        this.saving_balance = saving_balance;
    }
    // public void create_account(String name, int routing_number, double checking_balance, double saving_balance)
    // {
    //     System.out.println("Enter your name: ");
    //     name = scan.nextLine();
    //     account.put("name", name);
    //     account.put("routing_number", routing_number);
    //     account.put("checking_balance", checking_balance);
    //     account.put("saving_balance", saving_balance);

    //     System.out.println("Your account info is: " + account);
    // }

    public void print_account(Dictionary<String, Object> account_dict)
    {
        System.out.println("Account name: " + account_dict.get(name));
        System.out.println("Checking balance: " + account_dict.get(checking_balance));
        System.out.println("Savings balance: " + account_dict.get(saving_balance));
        System.out.println("Routing number: " + account_dict.get(routing_number));
        return;
    }

    public void display()
    {
        System.out.println("Account name: " + name);
        System.out.println("Rounting Number: " + routing_number);
        System.out.println("CHecking Balance: " + checking_balance);
        System.out.println("Saving Balance: " + saving_balance);
    }

}
