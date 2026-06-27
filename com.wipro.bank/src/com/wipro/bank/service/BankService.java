package com.wipro.bank.service;

import com.wipro.bank.acc.RDAccount;
import com.wipro.bank.exception.BankValidationException;

public class BankService {

    public boolean ValidateData(float principal, int tenure, int age, String gender) {

        try {
            if (principal >= 500 &&
                (tenure == 5 || tenure == 10) &&
                (gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female")) &&
                age <= 100) 

                return true;
            
             else 
                throw new BankValidationException();
            
        } 
        catch (BankValidationException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    public void calculate(float principal,int tenure, int age, String gender) {
    	boolean isValid=ValidateData(principal,tenure,age,gender);
    	if(isValid) {
    		RDAccount rda=  new RDAccount(tenure,principal);
    		rda.setInterest(age, gender);
    		float mat=rda.calculateInterest();
    		System.out.println("maturity interest="+mat);
    		float tp=rda.calculateAmountDeposited();
    		System.out.println("Total Amount Deposited"+tp);
    		System.out.println(rda.calculateMaturityAmount(tp,mat));
    		
    	}
    }
}