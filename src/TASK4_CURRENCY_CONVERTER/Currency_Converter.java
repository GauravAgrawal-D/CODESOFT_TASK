package TASK4_CURRENCY_CONVERTER;

import java.util.Scanner;
public class Currency_Converter {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Currency Converter");
            System.out.print("Enter the base currency (e.g., USD): ");
            String baseCurrency = scanner.nextLine().toUpperCase();

            System.out.print("Enter the target currency (e.g., EUR): ");
            String targetCurrency = scanner.nextLine().toUpperCase();

            double exchangeRate = fetchExchangeRate(baseCurrency, targetCurrency);

            if (exchangeRate == -1.0) {
                System.out.println("Exchange rate data not available.");
            } else {
                System.out.print("Enter the amount in " + baseCurrency + ": ");
                double amount = scanner.nextDouble();

                double convertedAmount = convertCurrency(amount, exchangeRate);

                System.out.println(amount + " " + baseCurrency + " is equivalent to " + convertedAmount + " " + targetCurrency);
            }

            scanner.close();
        }


        public static double fetchExchangeRate(String baseCurrency, String targetCurrency) {

            if (baseCurrency.equals("USD") && targetCurrency.equals("EUR")) {
                return 0.85;
            } else {
                return -1.0;
            }
        }

        public static double convertCurrency(double amount, double exchangeRate) {
            return amount * exchangeRate;
        }
    }


