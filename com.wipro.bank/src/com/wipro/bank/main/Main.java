package com.wipro.bank.main;
import java.util.*;

import com.wipro.bank.service.BankService;

public class Main {
public static void main(String[] args) {
	System.out.println("Enter the Tenure(5 or 10) ");
	Scanner in=new Scanner(System.in);
	int tenure=in.nextInt();
	
	System.out.println("ENter principal amt >=500:");
	float principal=in.nextFloat();
	
	System.out.println("Enter user age");
	int age=in.nextInt();
	
	System.out.println("Enter user's gender");
	String gender=in.next();
	
	BankService service=new BankService();
	service.calculate(principal, tenure, age, gender);
}
}
