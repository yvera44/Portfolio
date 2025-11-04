package com.pluralsight;

import com.pluralsight.finance.Gold;

public class FinanceApplication {
    public static void main(String[] args) {

        CheckingAccount checkingAccount = new CheckingAccount("Yair's Checking", "232323", 10555);
        CreditCard creditCard = new CreditCard("Yair's Master Card", "212121", -567);
        Gold gold = new Gold("Gold Bar", 70000, 1.5);

        Portfolio portfolio = new Portfolio("Yair's Assets", "Yair");

        portfolio.add(checkingAccount);
        portfolio.add(creditCard);
        portfolio.add(gold);

        System.out.println(portfolio.getValue());

    }
}
