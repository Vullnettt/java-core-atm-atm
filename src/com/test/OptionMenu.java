package com.test;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account{
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    HashMap<Integer,Integer> data = new HashMap<Integer,Integer>();

    public void getLogin()throws IOException {
        int x = 1;
        try{
            data.put(1234 , 4321);
            data.put(4321, 1234);
            System.out.println("Welcome to ATM project");
            System.out.println("Enter your costumer number");
            setCostumerNumber(menuInput.nextInt());

            System.out.println("Enter your Pin number");
            setPinNumber(menuInput.nextInt());
        }catch(Exception e){
            System.out.println("\n" + "Invalid Character(s). Only Number." + "\n");
            x = 2;
        }
        int cn = getCostumerNumber();
        int pn = getPinNumber();

        if(data.containsKey(cn) && data.get(cn) == pn){
            getAccountType();
        }else{
            System.out.println("\n" + "Wrong costumer number or pin number" + "\n");
        }

    }

    public void getAccountType(){
        System.out.println("Select the Account you Want to Access: ");
        System.out.println(" Type 1 - Checking Account");
        System.out.println(" Type 2 - Saving Account");
        System.out.println(" Type 3 - Exit");
        int selection = menuInput.nextInt();

        switch(selection){
            case 1:
                getChecking();
                break;

            case 2:
                getSaving();
                break;

            case 3:
                System.out.println("Thank you for Using this ATM bye. " + "\n");
                break;
            default:
                System.out.println("\n" + "Invalid Choose. " + "\n");
                getAccountType();
        }
    }

    public void getChecking(){
        System.out.println("Checking Account: ");
        System.out.println(" Type 1 - View Balance");
        System.out.println(" Type 2 - WithDraw Founds");
        System.out.println(" Type 3 - Deposit Founds");
        System.out.println(" Type 4 - Back");
        System.out.println(" Type 5 - Exit");
        System.out.println("Choice: ");

        int selection = menuInput.nextInt();

        switch(selection){
            case 1:
                System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
                getChecking();
                break;
            case 2:
                getCheckingWithDrawInput();
                getChecking();
                break;
            case 3:
                getCheckingDepositInput();
                getChecking();
                break;
            case 4:
                getAccountType();
            case 5:
                System.out.println("Thank You for Using this Atm , bye.");
            default:
                System.out.println("\n" + "Invalid Choice " + "\n");
                getChecking();
        }

    }

    public void getSaving(){
        System.out.println("Saving Account: ");
        System.out.println(" Type 1 - View Balance");
        System.out.println(" Type 2 - Withdraw Founds");
        System.out.println(" Type 3 - Deposit Founds");
        System.out.println(" Type 4 - Back");
        System.out.println(" Type 5 - Exit");
        System.out.println("Choice: ");
        int selection = menuInput.nextInt();

        switch(selection){
            case 1:
                System.out.println("Saving Account Balance : " + moneyFormat.format(getSavingBalance()));
                getSaving();
                break;
            case 2:
                getSavingWithDrawInput();
                getSaving();
                break;
            case 3:
                getSavingDepositInput();
                getSaving();
                break;
            case 4:
                getAccountType();
            case 5:
                System.out.println("Thank you for Using this ATM , bye");
                break;
            default:
                System.out.println("\n" + "Invalid Choice." + "\n");
                getChecking();

        }

    }
}

