package com.test;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private int costumerNumber;
    private int pinNumber;
    private double checkingBalance;
    private double savingBalance;

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    public int setCostumerNumber(int costumerNumber){
        this.costumerNumber = costumerNumber;
        return costumerNumber;
    }
    public int getCostumerNumber(){
        return costumerNumber;
    }

    public int setPinNumber(int pinNumber){
        this.pinNumber = pinNumber;
        return pinNumber;
    }
    public int getPinNumber(){
        return pinNumber;
    }

    public double getCheckingBalance(){
        return checkingBalance;
    }
    public double getSavingBalance(){
        return savingBalance;
    }

    public double calcCheckingWithDraw(double amount){
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }
    public double calcSavingWithDraw(double amount){
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }


    public double calcCheckingDeposit(double amount){
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }
    public double calcSavingDeposit(double amount){
        savingBalance = (savingBalance + amount);
        return savingBalance;
    }


    public void getCheckingWithDrawInput(){
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to withdraw from Checking Account");
        double amount = input.nextDouble();
        if((checkingBalance - amount) >= 0 ){
            calcCheckingWithDraw(amount);
            System.out.println("New Checking Account Balance : " + moneyFormat.format(checkingBalance));
        }else{
            System.out.println("Balance Cannot be Negative " + "\n");
        }

    }

    public void getSavingWithDrawInput(){
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to withdraw from Saving Account");
        double amount = input.nextDouble();
        if((savingBalance - amount) >= 0 ){
            calcSavingWithDraw(amount);
            System.out.println("New Saving Account Balance : " + moneyFormat.format(savingBalance));
        }else{
            System.out.println("Balance Cannot be Negative " + "\n");
        }
    }

    public void getCheckingDepositInput(){
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to withdraw from Checking Account");
        double amount = input.nextDouble();
        if((checkingBalance + amount) >= 0 ){
            calcCheckingDeposit(amount);
            System.out.println("New Checking Account Balance : " + moneyFormat.format(checkingBalance));
        }else{
            System.out.println("Balance Cannot be Negative " + "\n");
        }

    }

    public void getSavingDepositInput(){
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to withdraw from Saving Account");
        double amount = input.nextDouble();
        if((savingBalance + amount) >= 0 ){
            calcSavingDeposit(amount);
            System.out.println("New Saving Account Balance : " + moneyFormat.format(savingBalance));
        }else{
            System.out.println("Balance Cannot be Negative " + "\n");
        }
    }
}
