package com.ruthik.www;

import java.util.Scanner;

public class EmiCalculator {
    
    public static double calculateEMI(double principal, double annualInterestRate, int loanTenure) {
       
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        
        double emi = (principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, loanTenure)) / 
                     (Math.pow(1 + monthlyInterestRate, loanTenure) - 1);
        return emi;
    }

    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the loan amount (Principal): ");
        double principal = scanner.nextDouble();
        
        System.out.println("Enter the annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();
        
        System.out.println("Enter the loan tenure in years: ");
        int loanTenureInYears = scanner.nextInt();
        
        int loanTenureInMonths = loanTenureInYears * 12;
        
        double emi = calculateEMI(principal, annualInterestRate, loanTenureInMonths);
        
        System.out.printf("Your monthly EMI is: %.2f\n", emi);
        
        scanner.close();
    }
}
