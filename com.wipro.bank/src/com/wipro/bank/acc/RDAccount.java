package com.wipro.bank.acc;

public class RDAccount extends Account{
	public RDAccount(int tenure,float principal) {
		this.tenure=tenure;
		this.principal=principal;
	}
	@Override
	public float calculateAmountDeposited() {
		return principal*tenure*12;
	}
	@Override
    public float calculateInterest() {
        float amountDeposited = calculateAmountDeposited();

        return (float)(amountDeposited *
                Math.pow(1 + (rateOfInterest / 100.0) / 4, 4 * tenure)
                - amountDeposited);
    }
	
}
