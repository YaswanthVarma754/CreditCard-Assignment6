package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        Logger logger = Logger.getLogger("com.api.jar");
        String name;
        int cardNumber;
        String expDate;
        logger.info("Enter card details for first person");
        logger.info("Enter name : ");
        name = sc.nextLine();
        logger.info("Enter card number : ");
        cardNumber = sc.nextInt();
        sc.nextLine();
        logger.info("Enter expiry date : ");
        expDate = sc.nextLine();
        CreditCard c1 = new CreditCard(name, cardNumber, expDate);
        logger.info("Enter card details of second person");
        logger.info("Enter name :");
        name = sc.nextLine();
        logger.info("Enter card number : ");
        cardNumber = sc.nextInt();
        sc.nextLine();
        logger.info("Enter expiry date : ");
        expDate = sc.nextLine();
        CreditCard c2 = new CreditCard(name, cardNumber, expDate);
        logger.info("Before cloning");
        String check = "Objects c1 and c2 are both equal : " + c1.equals(c2);
        logger.info(check);
        c2 = c1.clone();
        logger.info("After Cloning");
        check = "Objects c1 and c2 are both equal : " + c1.equals(c2);
        logger.info(check);
    }
}
